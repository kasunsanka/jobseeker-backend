package com.icbt.jobseeker.service;

import java.util.List;

import com.icbt.jobseeker.dto.JobseekerDto;

public interface JobseekerService {
    List<JobseekerDto> getAllJobSeekers();

    JobseekerDto getJobSeekerById(Long id);

    void saveJobSeeker(JobseekerDto jobseekerDto);

    void updateJobSeeker(Long id, JobseekerDto jobseekerDto);

    void deleteJobSeeker(Long id);
}
