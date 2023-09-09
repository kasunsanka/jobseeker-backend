package com.icbt.appoiment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icbt.appoiment.entity.Appointment;
import com.icbt.appoiment.repo.AppoimentRepository;
import com.icbt.appoiment.repo.SeekerDetailRepository;
import com.icbt.appoiment.service.AppointmentService;
@Service
@Transactional
public class AppoimentServiceImpl implements AppointmentService {
	@Autowired
    private AppoimentRepository repo;
	public Appointment createAppointment(Appointment appointment) {
	
		if (appointment.getSeekerDetail() == null || appointment.getSeekerDetail().getId() == null) {
		    throw new IllegalArgumentException("An appointment must have an associated seeker detail.");
		}
		if (appointment.getUser() == null || appointment.getUser().getId() == null) {
		    throw new IllegalArgumentException("An appointment must have an associated user detail.");
		}
		
		appointment.setUser(appointment.getUser());
		appointment.setSeekerDetail(appointment.getSeekerDetail());
		return repo.save(appointment);	}
}
