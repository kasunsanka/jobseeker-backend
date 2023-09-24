package com.icbt.jobseeker.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import com.icbt.jobseeker.dto.SeekerDto;
import com.icbt.jobseeker.entity.Seeker;
import com.icbt.jobseeker.repository.SeekerRepository;
import com.icbt.jobseeker.service.SeekerService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class SeekerServiceImpl implements SeekerService {
    @Autowired
    private final SeekerRepository seekerRepository;

    @Autowired
    public SeekerServiceImpl(SeekerRepository seekerRepository) {
        this.seekerRepository = seekerRepository;
    }

    @Override
    public SeekerDto createSeeker(SeekerDto seekerDto) {
        Seeker seeker = convertToEntity(seekerDto);
       
        Seeker savedSeeker = seekerRepository.save(seeker);
         System.out.println(savedSeeker+"KKKKKKKKKKKKKKKKK");
        return convertToDto(savedSeeker);
    }

    @Override
    public SeekerDto updateSeeker(Long id, SeekerDto seekerDto) {
        // Check if the Seeker with the given ID exists
        //Seeker existingSeeker = seekerRepository.findById(id)
               // .orElseThrow(() -> new NotFoundException("Seeker not found"));

        // Update the existing Seeker with the new data
        ///existingSeeker.setFirstname(seekerDto.getFirstname());
        //existingSeeker.setNic(seekerDto.getNic());
        // Update other fields similarly

       // Seeker updatedSeeker = seekerRepository.save(existingSeeker);
        //return convertToDto(updatedSeeker);
        return null;
    }

    @Override
    public void deleteSeeker(Long id) {
        // // Check if the Seeker with the given ID exists
        // Seeker existingSeeker = seekerRepository.findById(id)
        //         .orElseThrow(() -> new NotFoundException("Seeker not found"));

        // // Delete the Seeker
        // seekerRepository.delete(existingSeeker);
    }

    @Override
    public SeekerDto getSeekerById(Long id) {
        // Seeker seeker = seekerRepository.findById(id)
        //         .orElseThrow(() -> new NotFoundException("Seeker not found"));
        // return convertToDto(seeker);
        return null;
    }

    @Override
    public List<SeekerDto> getAllSeekers() {
        List<Seeker> seekers = seekerRepository.findAll();
        return seekers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    // Helper methods to convert between entity and DTO
    private SeekerDto convertToDto(Seeker seeker) {
        SeekerDto seekerDto = new SeekerDto();
        seekerDto.setId(seeker.getId());
        seekerDto.setFirstname(seeker.getFirstname());
        seekerDto.setNic(seeker.getNic());
        // Map other fields similarly
        return seekerDto;
    }

    private Seeker convertToEntity(SeekerDto seekerDto) {
        Seeker seeker = new Seeker();
        seeker.setFirstname(seekerDto.getFirstname());
        seeker.setNic(seekerDto.getNic());
        // Map other fields similarly
        return seeker;
    }
}
