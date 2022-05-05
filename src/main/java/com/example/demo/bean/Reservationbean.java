package com.example.demo.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import java.util.Date;

@Entity
@Table
@Data
public class Reservationbean {
	
	@Id
	private String reservationID;
	private String scheduleID;
	private String userID;
	Date bookingDate=new Date();
	Date journeyDate = new Date();
	private int noOfSeats;
	private double totalFare;
	private String bookingStatus;

}
