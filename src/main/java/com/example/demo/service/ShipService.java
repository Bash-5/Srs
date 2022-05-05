package com.example.demo.service;
import java.util.ArrayList;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  

import org.springframework.stereotype.Service;


import com.example.demo.bean.Shipbean;
import com.example.demo.dao.ShipRepo;
import com.example.demo.exception.ShipNotFoundException;


@Service
public class ShipService {
   @Autowired
   private ShipRepo Sp;
   
   public List<Shipbean> getAllShip()   
	{  
	List<Shipbean> ships = new ArrayList<Shipbean>();  
	Sp.findAll().forEach(ship -> ships.add(ship));  
	return ships;  
	}  
    public List<Shipbean> findById(String shipId){
    	 return (List<Shipbean>)Sp.findByShipId(shipId);
     }
	  
	public void saveOrUpdate(Shipbean shipbean)   
	{  
	Sp.save(shipbean);  
	} 

	public int deleteById(String shipId)   
	{  
		if(Sp.existsById(shipId)) {
			
	         Sp.deleteById(shipId);
		      return 1;
	     }
	    else
	    {
		throw new ShipNotFoundException();
	    }  
	
	 }
	public void update(Shipbean shipbean, String shipId)   
	{  
	Sp.save(shipbean);  
	}  
	 

}
  