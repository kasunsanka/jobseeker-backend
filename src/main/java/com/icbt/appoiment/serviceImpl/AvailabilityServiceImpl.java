package com.icbt.appoiment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icbt.appoiment.entity.Appointment;
import com.icbt.appoiment.entity.Availability;
import com.icbt.appoiment.repo.AppoimentRepository;
import com.icbt.appoiment.repo.AvailabilityRepository;
import com.icbt.appoiment.service.AvailabilityService;

@Service
@Transactional
public class AvailabilityServiceImpl implements AvailabilityService{
	@Autowired
    private AvailabilityRepository repo;
	
	public Availability createAvailability(Availability availability) {
		
		
		
			if (availability.getUser() == null || availability.getUser().getId() == null) {
			    throw new IllegalArgumentException("An appointment must have an associated user detail.");
			}
			
			
			availability.setUser(availability.getUser());
			
			return repo.save(availability);	}
}
