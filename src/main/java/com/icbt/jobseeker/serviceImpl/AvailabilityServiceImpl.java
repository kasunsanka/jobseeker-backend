package com.icbt.jobseeker.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbt.jobseeker.dto.AvailabilityDto;
import com.icbt.jobseeker.dto.ConsultantDto;
import com.icbt.jobseeker.entity.Availability;
import com.icbt.jobseeker.entity.Consultant;
import com.icbt.jobseeker.repository.AvailabilityRepository;
import com.icbt.jobseeker.repository.ConsultantRepository;
import com.icbt.jobseeker.service.AvailabilityService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
    

@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    @Autowired
    private AvailabilityRepository availabilityRepository;
     @Autowired
    private ConsultantRepository consultantRepository;

    @Override
    public AvailabilityDto createAvailability(AvailabilityDto availabilityDto) {
        Optional<Consultant> consultantOptional = consultantRepository.findById(availabilityDto.getConsultantId());
        if (consultantOptional.isEmpty()) {
            // Handle the case where the consultant does not exist
          System.out.println("cdcdccdcd");
        }

        Availability availability = new Availability();
        availability.setDate(availabilityDto.getDate());
        availability.setTime(availabilityDto.getTime());
        availability.setType(availabilityDto.getType());

        // Set the consultant
        availability.setConsultant(consultantOptional.get());

        Availability savedAvailability = availabilityRepository.save(availability);
        return mapAvailabilityToDto(savedAvailability);
    }

       


    

    @Override
    public AvailabilityDto getAvailabilityById(Long availabilityId) {
        Availability availability = availabilityRepository.findById(availabilityId)
                .orElseThrow(() -> new RuntimeException("Availability not found"));

        return mapAvailabilityToDto(availability);
    }

    @Override
    public List<AvailabilityDto> getAllAvailabilities() {
        List<Availability> availabilities = availabilityRepository.findAll();
        return availabilities.stream()
                .map(this::mapAvailabilityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAvailability(Long availabilityId) {
        availabilityRepository.deleteById(availabilityId);
    }

    @Override
    public AvailabilityDto updateAvailability(Long availabilityId, AvailabilityDto availabilityDto) {
        Availability existingAvailability = availabilityRepository.findById(availabilityId)
                .orElseThrow(() -> new RuntimeException("Availability not found"));

        existingAvailability.setDate(availabilityDto.getDate());
        existingAvailability.setTime(availabilityDto.getTime());
        existingAvailability.setType(availabilityDto.getType());

        // Assuming availabilityDto includes a consultantId
        Consultant consultant = new Consultant();
        consultant.setId(availabilityDto.getConsultantId());
        existingAvailability.setConsultant(consultant);

        Availability updatedAvailability = availabilityRepository.save(existingAvailability);
        return mapAvailabilityToDto(updatedAvailability);
    }

    private AvailabilityDto mapAvailabilityToDto(Availability availability) {
        AvailabilityDto availabilityDto = new AvailabilityDto();
        availabilityDto.setId(availability.getId());
        availabilityDto.setDate(availability.getDate());
        availabilityDto.setTime(availability.getTime());
        availabilityDto.setType(availability.getType());
        availabilityDto.setConsultantId(availability.getConsultant().getId());
        return availabilityDto;
    }






    @Override
    public List<AvailabilityDto> findAvailabilitiesByDateAndTime(String date, String time) {
        List<Availability> availabilities = availabilityRepository.findByDateAndTime(date, time);
        return availabilities.stream()
                .map(this::mapAvailabilityToDto)
                .collect(Collectors.toList());
    }






    @Override
    public List<AvailabilityDto> getAvailabilityByDateAndTime(String date, String time) {
        List<Object[]> resultList = availabilityRepository.findAvailabilityWithConsultantByDateAndTime(date, time);
        
        // Map the result to your desired DTO structure
        List<AvailabilityDto> availabilityDtos = mapResultToDto(resultList);

        return availabilityDtos;
    }
    private List<AvailabilityDto> mapResultToDto(List<Object[]> resultList) {
        List<AvailabilityDto> availabilityDtos = new ArrayList<>();
    
        for (Object[] row : resultList) {
            AvailabilityDto availabilityDto = new AvailabilityDto();
    
            // Handle the conversion from BigInteger to Long for the id field
            BigInteger idBigInteger = (BigInteger) row[0];
            Long idLong = idBigInteger != null ? idBigInteger.longValue() : null;
            availabilityDto.setId(idLong);
    
            availabilityDto.setDate((String) row[1]);
            availabilityDto.setTime((String) row[2]);
            availabilityDto.setType((String) row[3]);
    
            // Handle the conversion from BigInteger to Long for consultant id
            BigInteger consultantIdBigInteger = (BigInteger) row[4];
            Long consultantIdLong = consultantIdBigInteger != null ? consultantIdBigInteger.longValue() : null;
    
            ConsultantDto consultantDto = new ConsultantDto();
            consultantDto.setId(consultantIdLong);
            consultantDto.setEmail((String) row[5]);
            consultantDto.setMobile((String) row[6]);
            consultantDto.setName((String) row[7]);
            consultantDto.setNic((String) row[8]);
            consultantDto.setRole((String) row[9]);
            consultantDto.setUsername((String) row[10]);
    
            availabilityDto.setConsultant(consultantDto);
            availabilityDtos.add(availabilityDto);
        }
    
        return availabilityDtos;

      
    }
    // @Override
    // public List<AvailabilityDto> getAllAvailabilities() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllAvailabilities'");
    // }
}