package com.icbt.jobseeker.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbt.jobseeker.dto.JobseekerDto;
import com.icbt.jobseeker.entity.Jobseeker;
import com.icbt.jobseeker.repository.JobseekerRepository;
import com.icbt.jobseeker.service.JobseekerService;

@Service
public class JobseekerServiceImpl  implements JobseekerService {


    private final JobseekerRepository jobseekerRepository;

    @Autowired
    public JobseekerServiceImpl(JobseekerRepository jobseekerRepository) {
        this.jobseekerRepository = jobseekerRepository;
    }

    @Override
    public List<JobseekerDto> getAllJobSeekers() {
        List<Jobseeker> jobseekers = jobseekerRepository.findAll();
        return jobseekers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public JobseekerDto getJobSeekerById(Long id) {
        Jobseeker jobseeker = jobseekerRepository.findById(id).orElse(null);
        return (jobseeker != null) ? convertToDto(jobseeker) : null;
    }

    @Override
    public void saveJobSeeker(JobseekerDto jobseekerDto) {
        Jobseeker jobseeker = convertToEntity(jobseekerDto);
        jobseekerRepository.save(jobseeker);
    }

    @Override
    public void updateJobSeeker(Long id, JobseekerDto jobseekerDto) {
        Jobseeker existingJobseeker = jobseekerRepository.findById(id).orElse(null);

        if (existingJobseeker != null) {
            // Update fields of existingJobseeker with values from jobseekerDto
            existingJobseeker.setEmail(jobseekerDto.getEmail());
            existingJobseeker.setMobile(jobseekerDto.getMobile());
            existingJobseeker.setName(jobseekerDto.getName());
            existingJobseeker.setNic(jobseekerDto.getNic());
            existingJobseeker.setRole(jobseekerDto.getRole());
            existingJobseeker.setUsername(jobseekerDto.getUsername());
            existingJobseeker.setDate(jobseekerDto.getDate());
            existingJobseeker.setTime(jobseekerDto.getTime());
            existingJobseeker.setConsultantId(jobseekerDto.getConsultantId());
            existingJobseeker.setStatus(jobseekerDto.getStatus());

            jobseekerRepository.save(existingJobseeker);
        }
    }

    @Override
    public void deleteJobSeeker(Long id) {
        jobseekerRepository.deleteById(id);
    }

    private JobseekerDto convertToDto(Jobseeker jobseeker) {
        JobseekerDto jobseekerDto = new JobseekerDto();
        jobseekerDto.setId(jobseeker.getId());
        jobseekerDto.setEmail(jobseeker.getEmail());
        jobseekerDto.setMobile(jobseeker.getMobile());
        jobseekerDto.setName(jobseeker.getName());
        jobseekerDto.setNic(jobseeker.getNic());
        jobseekerDto.setRole(jobseeker.getRole());
        jobseekerDto.setUsername(jobseeker.getUsername());
        jobseekerDto.setDate(jobseeker.getDate());
        jobseekerDto.setTime(jobseeker.getTime());
        jobseekerDto.setConsultantId(jobseeker.getConsultantId());
        jobseekerDto.setStatus(jobseeker.getStatus());

        return jobseekerDto;
    }

    private Jobseeker convertToEntity(JobseekerDto jobseekerDto) {
        Jobseeker jobseeker = new Jobseeker();
        jobseeker.setEmail(jobseekerDto.getEmail());
        jobseeker.setMobile(jobseekerDto.getMobile());
        jobseeker.setName(jobseekerDto.getName());
        jobseeker.setNic(jobseekerDto.getNic());
        jobseeker.setRole(jobseekerDto.getRole());
        jobseeker.setUsername(jobseekerDto.getUsername());
        jobseeker.setDate(jobseekerDto.getDate());
        jobseeker.setTime(jobseekerDto.getTime());
        jobseeker.setConsultantId(jobseekerDto.getConsultantId());
        jobseeker.setStatus(jobseekerDto.getStatus());

        return jobseeker;
    }

    
}
