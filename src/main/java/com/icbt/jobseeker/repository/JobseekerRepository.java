package com.icbt.jobseeker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbt.jobseeker.entity.Jobseeker;



@Repository
public interface JobseekerRepository extends JpaRepository<Jobseeker, Long>{
    
}
