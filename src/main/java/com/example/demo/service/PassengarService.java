package com.example.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.Passengerbean;

import com.example.demo.dao.PassengerRepo;
import com.example.demo.dao.ScheduleRepo;

@Service
public class PassengarService {
    
	@Autowired
    PassengerRepo PR;
	ScheduleRepo SR;
	   
	public List<Passengerbean> viewPassengersByShip()   
	{  
	List<Passengerbean> passengers = new ArrayList<Passengerbean>();  
	PR.findAll().forEach(p1 -> passengers.add(p1));  
	return passengers;  
	}  
	public Passengerbean getPassengerById(String scheduleId)   
	{  
	return PR.findById(scheduleId).get();  
	}  
	
}