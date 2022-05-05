package com.example.demo.bean;
import javax.persistence.Entity;


import javax.persistence.Id;

import javax.persistence.Table;
import java.util.Date;

import lombok.Data;
@Entity

@Table
@Data
public class Schedulebean {
        
	@Id
	private String scheduleId;
    private String shipId;
    private String routeId;
    Date startDate= new Date();
  
}
