package com.example.demo.bean;
import javax.persistence.Entity;



import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;
@Entity


@Data
@Table
public class Shipbean {
	@Id
     private String shipId;
     private String shipName;
     private int seatingCapacity;
     private int reservationCapacity;
     
}
