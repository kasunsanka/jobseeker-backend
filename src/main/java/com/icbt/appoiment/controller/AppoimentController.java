package com.icbt.appoiment.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icbt.appoiment.entity.Appointment;
import com.icbt.appoiment.service.AppointmentService;

@RestController
@RequestMapping("/appoiment")
@CrossOrigin(origins = "http://localhost:3000")
public class AppoimentController {

	 @Autowired
	    private AppointmentService appointmentService;
	 
	 @PostMapping("/add")
	    public Appointment createAppoinment(@RequestBody Appointment appointment) {
	        return appointmentService.createAppointment(appointment);
	    }

    
}
