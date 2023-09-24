package com.icbt.jobseeker.service;

import java.util.List;

import com.icbt.jobseeker.dto.ConsultantDto;


public interface ConsultantService {
    ConsultantDto createConsultant(ConsultantDto consultantDto);
    ConsultantDto getConsultantById(Long consultantId);
    List<ConsultantDto> getAllConsultants();
    void deleteConsultant(Long consultantId);
    ConsultantDto updateConsultant(Long consultantId, ConsultantDto consultantDto);
}
