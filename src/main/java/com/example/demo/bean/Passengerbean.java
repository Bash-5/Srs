package com.example.demo.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table

@Data
public class Passengerbean {
         
	   @Id
	   private String reservationId;
	   private String scheduleId;
	   private String name;
	   private int age;
	   private String gender;
}
