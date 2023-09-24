package com.icbt.jobseeker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.icbt.jobseeker.dto.ConsultantDto;
import com.icbt.jobseeker.service.ConsultantService;

import java.util.List;


@RestController
@RequestMapping("/consultants")
@CrossOrigin(origins = "http://localhost:3000")
public class ConsultantController {

    @Autowired
    private ConsultantService consultantService;

    @PostMapping
    public ResponseEntity<ConsultantDto> createConsultant(@RequestBody ConsultantDto consultantDto) {
        ConsultantDto createdConsultant = consultantService.createConsultant(consultantDto);
        return new ResponseEntity<>(createdConsultant, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultantDto> getConsultantById(@PathVariable Long id) {
        ConsultantDto consultantDto = consultantService.getConsultantById(id);
        return ResponseEntity.ok(consultantDto);
    }

    @GetMapping
    public ResponseEntity<List<ConsultantDto>> getAllConsultants() {
        List<ConsultantDto> consultants = consultantService.getAllConsultants();
        return ResponseEntity.ok(consultants);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConsultantDto> updateConsultant(@PathVariable Long id, @RequestBody ConsultantDto consultantDto) {
        ConsultantDto updatedConsultant = consultantService.updateConsultant(id, consultantDto);
        return ResponseEntity.ok(updatedConsultant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConsultant(@PathVariable Long id) {
        consultantService.deleteConsultant(id);
        return ResponseEntity.noContent().build();
    }
}