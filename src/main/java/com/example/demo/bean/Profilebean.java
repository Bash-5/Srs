package com.example.demo.bean;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table
@Data
public class Profilebean {
	
	@Id
	private String userId;
	private String firstName;
	private String lastName;
	Date dateOfBirth= new Date();
	private String gender;
	private String street;
	private String location;
	private String city;
	private String state;
	private String pincode;
	private String mobileNo;
	private String emailID;
	private String password;
	
}
