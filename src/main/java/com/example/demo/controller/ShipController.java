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
import com.example.demo.bean.Shipbean;

import com.example.demo.service.ShipService;
import com.example.demo.exception.ShipNotFoundException;


@RestController
public class ShipController {

	    @Autowired
	    ShipService SS;
	  
	    Shipbean sb;
	   
	   
	    @GetMapping("/ship")  
	    private List<Shipbean> getAllShip()   
	    {  
			   
	        return SS.getAllShip();
		}
	    
	
	   @GetMapping("/shipid/{shipId}")

	   public List<Shipbean> getshipid(@PathVariable("shipId") String shipId)
	    { 
	    			
	       if(SS.findById(shipId).isEmpty()) {
	    		   System.out.println("ship Not found");
	    		   throw new ShipNotFoundException();
	    		   
	    	}
	    	 System.out.println("Fetched Successfully");
	    	   return SS.findById(shipId); 
	   }
	    
	    @DeleteMapping("/shipid/{shipId}") 
	    public String deleteshipid(@PathVariable("shipId") String shipId)
	    { 
		  SS.deleteById(shipId);
		  return "deleted Successfully";
	    }  
	   

	   
	    @PostMapping("/ship")  
	    private String saveOrUpdate(@RequestBody Shipbean shipbean)   
	    {  
	    SS.saveOrUpdate(shipbean);  
	    return shipbean.getShipId();  
	    } 
	    
	    @PutMapping("/ships")  
	    private Shipbean update(@RequestBody Shipbean shipbean)   
	    {  
	    SS.saveOrUpdate(shipbean);  
	    return shipbean;  
	    }  
	    }  
	  

