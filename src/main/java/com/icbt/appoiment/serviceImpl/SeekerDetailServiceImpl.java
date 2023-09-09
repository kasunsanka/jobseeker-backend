package com.icbt.appoiment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icbt.appoiment.entity.SeekerDetail;
import com.icbt.appoiment.repo.SeekerDetailRepository;

import com.icbt.appoiment.service.SeekerDetailService;
@Service
@Transactional
public class SeekerDetailServiceImpl implements SeekerDetailService{
	@Autowired
    private SeekerDetailRepository repo;
	 
	public SeekerDetail createSeekerDetail(SeekerDetail seekerDetail) {
		 return repo.save(seekerDetail);
	}

	public List<SeekerDetail> fetchSeekerDetailList() {
		 return (List<SeekerDetail>)
				 repo.findAll();
	}
}
