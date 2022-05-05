package com.example.demo.bean;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data

public class Credentialsbean {
         
	  @Id
	  private String userId;
	 
	  private String password;
	  
	  private String userType;
	  
	  private int loginStatus;
	  
	 
}
