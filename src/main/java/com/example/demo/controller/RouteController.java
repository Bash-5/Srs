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

import com.example.demo.exception.RouteNotFoundException;


import com.example.demo.bean.Routebean;

import com.example.demo.service.RouteService;



@RestController
public class RouteController{

	    @Autowired
	    RouteService RS;
	    
	   
	    @GetMapping("/route")  
	    private List<Routebean> getAllRoute()   
	    {  
	    return RS.getAllRoute();  
	    }  
	    
	    @GetMapping("/route/{routeId}")
	    public List<Routebean> getRoute(@PathVariable("routeId") String routeId)
	    { 		
	       if(RS.getRouteById(routeId).isEmpty()) {
	    		   System.out.println("Route Not found");
	    		   throw new RouteNotFoundException();   
	    	}
	    	 System.out.println("Fetched Successfully");
	    	   return RS.getRouteById(routeId);
	   }
	   
	    @DeleteMapping("/route/{routeId}")  
	    private String deleteshipid(@PathVariable("routeId") String routeId)   
	    {  
	    RS.deleteById(routeId);  
	    return "deleted Successfully";
	    }  
	 
	    
	    @PostMapping("/route")  
	    private String saveOrUpdate(@RequestBody Routebean routebean)   
	    {  
	    RS.saveOrUpdate(routebean);  
	    return routebean.getRouteId();  
	    } 
	    
	    @PutMapping("/routes")  
	    private Routebean update(@RequestBody Routebean routebean)   
	    {  
	    RS.saveOrUpdate(routebean);  
	    return routebean;  
	    }  
	    }  
	  
