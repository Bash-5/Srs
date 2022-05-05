package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.bean.Profilebean;

public interface  AdminProfileRepo extends CrudRepository<Profilebean, String>{

}