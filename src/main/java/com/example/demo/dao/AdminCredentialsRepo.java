package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Credentialsbean;

public interface AdminCredentialsRepo  extends CrudRepository<Credentialsbean, String>{
	
}

	
