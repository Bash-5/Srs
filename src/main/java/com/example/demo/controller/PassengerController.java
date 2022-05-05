package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;  

import com.example.demo.bean.Passengerbean;
import com.example.demo.service.PassengarService;



@RestController
public class PassengerController {
	
	@Autowired
   PassengarService PS;
	
    @GetMapping("/viewbyship")  
    private List<Passengerbean> viewPassengersByShip()   
    {  
      return PS.viewPassengersByShip();  
    }  
 
    @GetMapping("/view/{scheduleId}")
    private Passengerbean getPassengerById(@PathVariable("scheduleId") String scheduleId)   
    {  
    return PS.getPassengerById(scheduleId);  
    }  
   
}
