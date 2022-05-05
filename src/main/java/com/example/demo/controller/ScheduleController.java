package com.example.demo.controller;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

	
import org.springframework.web.bind.annotation.DeleteMapping;  

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable; 

import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.bean.Schedulebean;
import com.example.demo.exception.ScheduleNotFoundException;

import com.example.demo.service.ScheduleService;

@RestController
public class ScheduleController{

		    @Autowired
		    ScheduleService SS1;
		    
		   
		    @GetMapping("/schedule")  
		    private List<Schedulebean> getAllSchedule()   
		    {  
		    return SS1.getAllSchedule();  
		    }  
		    
		    @GetMapping("/schedule/{scheduleId}")  
		    public List<Schedulebean> getSchedule(@PathVariable("scheduleId") String scheduleId)
		    { 		
		       if(SS1.getScheduleById(scheduleId).isEmpty()) {
		    		   System.out.println("Schedule Not found");
		    		   throw new ScheduleNotFoundException();   
		    	}
		    	 System.out.println("Fetched Successfully");
		    	   return SS1.getScheduleById(scheduleId);
		   }
		   
		    @DeleteMapping("/schedule/{scheduleId}")  
		    private String deleteScheduleid(@PathVariable("scheduleId") String scheduleId)   
		    {  
		    SS1.deleteById(scheduleId);  
		    return "deleted Successfully";
		    }  
		  
		    @PostMapping("/schedule")  
		    private String saveOrUpdate(@RequestBody Schedulebean schedulebean)   
		    {  
		    SS1.saveOrUpdate(schedulebean);  
		    return schedulebean.getScheduleId();  
		    } 
		    
		    @PutMapping("/schedule")  
		    private Schedulebean update(@RequestBody Schedulebean schedulebean)   
		    {  
		    SS1.saveOrUpdate(schedulebean);  
		    return schedulebean;  
		    }  
		    
		  

}
