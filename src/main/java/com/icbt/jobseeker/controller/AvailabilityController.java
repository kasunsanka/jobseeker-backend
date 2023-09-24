package com.icbt.jobseeker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.icbt.jobseeker.dto.AvailabilityDto;

import com.icbt.jobseeker.service.AvailabilityService;


import java.util.List;


@RestController
@RequestMapping("/availabilities")
@CrossOrigin(origins = "http://localhost:3000")
public class AvailabilityController {

    @Autowired
    private AvailabilityService availabilityService;

    @PostMapping
    public ResponseEntity<AvailabilityDto> createAvailability(@RequestBody AvailabilityDto availabilityDto) {
        AvailabilityDto createdAvailability = availabilityService.createAvailability(availabilityDto);
        return new ResponseEntity<>(createdAvailability, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AvailabilityDto> getAvailabilityById(@PathVariable Long id) {
        AvailabilityDto availabilityDto = availabilityService.getAvailabilityById(id);
        return ResponseEntity.ok(availabilityDto);
    }

    @GetMapping
    public ResponseEntity<List<AvailabilityDto>> getAllAvailabilities() {
        List<AvailabilityDto> availabilities = availabilityService.getAllAvailabilities();
        return ResponseEntity.ok(availabilities);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AvailabilityDto> updateAvailability(@PathVariable Long id, @RequestBody AvailabilityDto availabilityDto) {
        AvailabilityDto updatedAvailability = availabilityService.updateAvailability(id, availabilityDto);
        return ResponseEntity.ok(updatedAvailability);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAvailability(@PathVariable Long id) {
        availabilityService.deleteAvailability(id);
        return ResponseEntity.noContent().build();
    }


    // @GetMapping("/byDateAndTime")
    // public ResponseEntity<List<AvailabilityDto>> findAvailabilitiesByDateAndTime(
    //         @RequestParam("date") String date,
    //         @RequestParam("time") String time) {
    //     List<AvailabilityDto> availabilities = availabilityService.findAvailabilitiesByDateAndTime(date, time);
    //     return ResponseEntity.ok(availabilities);
    // }
      @GetMapping("/byDateAndTime")
    public ResponseEntity<List<AvailabilityDto>> getAvailabilitiesByDateAndTime(
            @RequestParam String date,
            @RequestParam String time) {
        List<AvailabilityDto> availabilities = availabilityService.getAvailabilityByDateAndTime(date, time);
        return ResponseEntity.ok(availabilities);
    }

}
