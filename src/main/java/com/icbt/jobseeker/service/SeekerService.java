package com.icbt.jobseeker.service;

import java.util.List;

import com.icbt.jobseeker.dto.SeekerDto;

public interface SeekerService {
    // Method to create a new Seeker
    SeekerDto createSeeker(SeekerDto seekerDto);

    // Method to update an existing Seeker
    SeekerDto updateSeeker(Long id, SeekerDto seekerDto);

    // Method to delete a Seeker by ID
    void deleteSeeker(Long id);

    // Method to retrieve a Seeker by ID
    SeekerDto getSeekerById(Long id);

    // Method to retrieve all Seekers
    List<SeekerDto> getAllSeekers();
}

