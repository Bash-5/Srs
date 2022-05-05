package com.example.demo.service;

import java.util.ArrayList; 


import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  

import org.springframework.stereotype.Service;
import com.example.demo.bean.Routebean;

import com.example.demo.dao.RouteRepo;
import com.example.demo.exception.RouteNotFoundException;

@Service
public class RouteService {
   @Autowired
   RouteRepo RR;
   
   public List<Routebean> getAllRoute()   
	{  
	List<Routebean> routes = new ArrayList<Routebean>();  
	RR.findAll().forEach(route -> routes.add(route));  
	return routes;  
	}  
	
   public List<Routebean> getRouteById(String routeId){
  	 return (List<Routebean>)RR.findByRouteId(routeId);
   }
	 
   
	public void saveOrUpdate(Routebean routebean)   
	{  
	RR.save(routebean);  
	}  
	
	
	public int deleteById(String shipId)   
	{  
		if(RR.existsById(shipId)) {
			
	         RR.deleteById(shipId);
		      return 1;
	     }
	    else
	    {
		throw new RouteNotFoundException();
	    }  
	
	 }
	
	public void update(Routebean routebean, String routeId)   
	{  
	RR.save(routebean);  
	}  
	 

}
  