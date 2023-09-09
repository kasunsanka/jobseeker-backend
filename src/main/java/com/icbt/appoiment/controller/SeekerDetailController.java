package com.icbt.appoiment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.icbt.appoiment.entity.SeekerDetail;
import com.icbt.appoiment.service.SeekerDetailService;


@RestController
@RequestMapping("/seeker")
@CrossOrigin(origins = "http://localhost:3000")
public class SeekerDetailController {
	@Autowired
	 private  SeekerDetailService seekerDetailService;
	
	
	@PostMapping("/detail/add")
    public SeekerDetail createBook(@RequestBody SeekerDetail seekerDetail){
   	System.out.println(seekerDetail+"kasun");
   	return 	 seekerDetailService.createSeekerDetail(seekerDetail);
   		
   		
	}   

//Read operation
@GetMapping("/Jobseeker")
public List<SeekerDetail> fetchSeekerDetailList()
{
    return seekerDetailService.fetchSeekerDetailList();
}
   		
}
   

