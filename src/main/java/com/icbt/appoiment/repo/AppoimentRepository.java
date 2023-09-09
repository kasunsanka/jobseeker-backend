package com.icbt.appoiment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbt.appoiment.entity.Appointment;
@Repository
public interface AppoimentRepository extends JpaRepository<Appointment, Long> {

}
