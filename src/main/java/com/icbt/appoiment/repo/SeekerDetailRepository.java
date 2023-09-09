package com.icbt.appoiment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbt.appoiment.entity.SeekerDetail;
@Repository
public interface SeekerDetailRepository  extends JpaRepository<SeekerDetail
,Long> {

}
