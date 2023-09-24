package com.icbt.jobseeker.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbt.jobseeker.dto.ConsultantDto;
import com.icbt.jobseeker.entity.Consultant;
import com.icbt.jobseeker.repository.ConsultantRepository;
import com.icbt.jobseeker.service.ConsultantService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultantServiceImpl implements ConsultantService {

    @Autowired
    private ConsultantRepository consultantRepository;

    @Override
    public ConsultantDto createConsultant(ConsultantDto consultantDto) {
        Consultant consultant = new Consultant();
        consultant.setEmail(consultantDto.getEmail());
        consultant.setMobile(consultantDto.getMobile());
        consultant.setName(consultantDto.getName());
        consultant.setNic(consultantDto.getNic());
        //consultant.setPassword(consultantDto.getPassword());
        consultant.setRole(consultantDto.getRole());
        consultant.setUsername(consultantDto.getUsername());

        Consultant savedConsultant = consultantRepository.save(consultant);
        return mapConsultantToDto(savedConsultant);
    }

    @Override
    public ConsultantDto getConsultantById(Long consultantId) {
        Consultant consultant = consultantRepository.findById(consultantId)
                .orElseThrow(() -> new RuntimeException("Consultant not found"));

        return mapConsultantToDto(consultant);
    }

    @Override
    public List<ConsultantDto> getAllConsultants() {
        List<Consultant> consultants = consultantRepository.findAll();
        return consultants.stream()
                .map(this::mapConsultantToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteConsultant(Long consultantId) {
        consultantRepository.deleteById(consultantId);
    }

    @Override
    public ConsultantDto updateConsultant(Long consultantId, ConsultantDto consultantDto) {
        Consultant existingConsultant = consultantRepository.findById(consultantId)
                .orElseThrow(() -> new RuntimeException("Consultant not found"));

        existingConsultant.setEmail(consultantDto.getEmail());
        existingConsultant.setMobile(consultantDto.getMobile());
        existingConsultant.setName(consultantDto.getName());
        existingConsultant.setNic(consultantDto.getNic());
       // existingConsultant.setPassword(consultantDto.getPassword());
        existingConsultant.setRole(consultantDto.getRole());
        existingConsultant.setUsername(consultantDto.getUsername());

        Consultant updatedConsultant = consultantRepository.save(existingConsultant);
        return mapConsultantToDto(updatedConsultant);
    }

    private ConsultantDto mapConsultantToDto(Consultant consultant) {
        ConsultantDto consultantDto = new ConsultantDto();
        consultantDto.setId(consultant.getId());
        consultantDto.setEmail(consultant.getEmail());
        consultantDto.setMobile(consultant.getMobile());
        consultantDto.setName(consultant.getName());
        consultantDto.setNic(consultant.getNic());
     //   consultantDto.setPassword(consultant.getPassword());
        consultantDto.setRole(consultant.getRole());
        consultantDto.setUsername(consultant.getUsername());
        return consultantDto;
    }

    // @Override
    // public List<ConsultantDto> getAllConsultants() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllConsultants'");
    // }
}