package com.icbt.appoiment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.icbt.appoiment.entity.Availability;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Long> {

}
