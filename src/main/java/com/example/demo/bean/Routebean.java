package com.example.demo.bean;
import javax.persistence.Entity;


import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;
@Entity

@Data
@Table
public class Routebean {
	
		@Id
	     private String routeId;
	     private String source;
	     private String destination;
	     private String travelDuration;
	     private double fare;
	     

}
