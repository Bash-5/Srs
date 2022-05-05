package com.example.demo.service;

import java.util.ArrayList; 

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  

import org.springframework.stereotype.Service;


import com.example.demo.bean.Schedulebean;
import com.example.demo.dao.ScheduleRepo;
import com.example.demo.exception.ScheduleNotFoundException;

@Service
public class ScheduleService {
	   @Autowired
	   ScheduleRepo SR;
	   
	   public List<Schedulebean> getAllSchedule()   
		{  
		List<Schedulebean> schedules = new ArrayList<Schedulebean>();  
		SR.findAll().forEach(schedule -> schedules.add(schedule));  
		return schedules;  
		}  
		
		public List<Schedulebean> getScheduleById(String scheduleId){
		  	 return (List<Schedulebean>)SR.findByScheduleId(scheduleId);
		   }
			 
		public void saveOrUpdate(Schedulebean schedulebean)   
		{  
		SR.save(schedulebean);  
		}  

		public int deleteById(String scheduleId)   
		{  
			if(SR.existsById(scheduleId)) {
				
		         SR.deleteById(scheduleId);
			      return 1;
		     }
		    else
		    {
			throw new ScheduleNotFoundException();
		    }  
		
		 }
		
		public void update(Schedulebean schedulebean, String scheduleId)   
		{  
		SR.save(schedulebean);  
		}  
		 

	
}
