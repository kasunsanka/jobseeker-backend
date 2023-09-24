package com.icbt.jobseeker.service;

import java.util.List;


import com.icbt.jobseeker.dto.AvailabilityDto;


public interface AvailabilityService {
    AvailabilityDto createAvailability(AvailabilityDto availabilityDto);
    AvailabilityDto getAvailabilityById(Long availabilityId);
    List<AvailabilityDto> getAllAvailabilities();
    void deleteAvailability(Long availabilityId);
    AvailabilityDto updateAvailability(Long availabilityId, AvailabilityDto availabilityDto);
    List<AvailabilityDto> findAvailabilitiesByDateAndTime(String date, String time);
    List<AvailabilityDto> getAvailabilityByDateAndTime(String date, String time);
}
