package com.icbt.jobseeker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.icbt.jobseeker.entity.Availability;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
    List<Availability> findByDateAndTime(String date, String time);

      @Query(nativeQuery = true, value =
            "SELECT av.id AS availability_id, av.date, av.time, av.type, " +
            "c.id AS consultant_id, c.email AS consultant_email, c.mobile AS consultant_mobile, " +
            "c.name AS consultant_name, c.nic AS consultant_nic, c.role AS consultant_role, " +
            "c.username AS consultant_username " +
            "FROM Availability av " +
            "JOIN Consultant c ON av.consultant_id = c.id " +
            "WHERE av.date = :dateParam AND av.time = :timeParam")
    List<Object[]> findAvailabilityWithConsultantByDateAndTime(@Param("dateParam") String date,
                                                               @Param("timeParam") String time);

}
