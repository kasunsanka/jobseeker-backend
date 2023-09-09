package com.icbt.appoiment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icbt.appoiment.entity.Appointment;
import com.icbt.appoiment.entity.Availability;
import com.icbt.appoiment.service.AppointmentService;
import com.icbt.appoiment.service.AvailabilityService;

@RestController
@RequestMapping("/availability")
@CrossOrigin(origins = "http://localhost:3000")
public class AvailabilityController {

	@Autowired
    private AvailabilityService availabilityService;
 
 @PostMapping("/add")
    public Availability createAvailability(@RequestBody Availability availability) {
        return availabilityService.createAvailability(availability);
    }

}
