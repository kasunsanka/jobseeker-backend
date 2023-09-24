package com.icbt.jobseeker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbt.jobseeker.entity.Seeker;

@Repository
public interface SeekerRepository extends JpaRepository<Seeker, Long>{
    
}
