package com.icbt.jobseeker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.icbt.jobseeker.dto.SeekerDto;
import com.icbt.jobseeker.service.SeekerService;

import java.util.List;

@RestController
@RequestMapping("/seekers")
public class SeekerController {

    
    private final SeekerService seekerService;

    @Autowired
    public SeekerController(SeekerService seekerService) {
        this.seekerService = seekerService;
    }

    @PostMapping
    public ResponseEntity<SeekerDto> createSeeker(@RequestBody SeekerDto seekerDto) {
        SeekerDto createdSeeker = seekerService.createSeeker(seekerDto);
        return new ResponseEntity<>(createdSeeker, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SeekerDto> updateSeeker(@PathVariable Long id, @RequestBody SeekerDto seekerDto) {
        SeekerDto updatedSeeker = seekerService.updateSeeker(id, seekerDto);
        return new ResponseEntity<>(updatedSeeker, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeeker(@PathVariable Long id) {
        seekerService.deleteSeeker(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SeekerDto> getSeekerById(@PathVariable Long id) {
        SeekerDto seekerDto = seekerService.getSeekerById(id);
        return new ResponseEntity<>(seekerDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<SeekerDto>> getAllSeekers() {
        List<SeekerDto> seekers = seekerService.getAllSeekers();
        return new ResponseEntity<>(seekers, HttpStatus.OK);
    }
}
