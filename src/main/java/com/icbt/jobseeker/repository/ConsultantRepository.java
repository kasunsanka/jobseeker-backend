package com.icbt.jobseeker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbt.jobseeker.entity.Consultant;

@Repository
public interface ConsultantRepository extends JpaRepository<Consultant, Long> {
    // You can define custom queries or methods here if needed
}
