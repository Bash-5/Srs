package com.example.demo.dao;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Shipbean;


public interface ShipRepo extends CrudRepository<Shipbean, String>
{

	List<Shipbean> findByShipId(String shipId);
    
	
	
}