package com.icbt.appoiment.service;

import java.util.List;

import com.icbt.appoiment.entity.SeekerDetail;

public interface SeekerDetailService {
	SeekerDetail createSeekerDetail(SeekerDetail seekerDetail);
	List<SeekerDetail> fetchSeekerDetailList();
}
