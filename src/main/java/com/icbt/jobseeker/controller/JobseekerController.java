


    package com.icbt.jobseeker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.icbt.jobseeker.dto.JobseekerDto;
import com.icbt.jobseeker.service.JobseekerService;

import java.util.List;

@RestController
@RequestMapping("/jobseekers")
@CrossOrigin
public class JobseekerController {

    @Autowired
    private  JobseekerService jobseekerService;

   

    @GetMapping("/")
    public List<JobseekerDto> getAllJobSeekers() {
        return jobseekerService.getAllJobSeekers();
    }

    @GetMapping("/{id}")
    public JobseekerDto getJobSeekerById(@PathVariable Long id) {
        return jobseekerService.getJobSeekerById(id);
    }

    @PostMapping("/")
    public void createJobSeeker(@RequestBody JobseekerDto jobSeekerDto) {
        jobseekerService.saveJobSeeker(jobSeekerDto);
    }

    @PutMapping("/{id}")
    public void updateJobSeeker(@PathVariable Long id, @RequestBody JobseekerDto jobseekerDto) {
        jobseekerService.updateJobSeeker(id, jobseekerDto);
    }

    @DeleteMapping("/{id}")
    public void deleteJobSeeker(@PathVariable Long id) {
        jobseekerService.deleteJobSeeker(id);
    }
}


