package com.example.demo.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Routebean;


public interface RouteRepo extends CrudRepository<Routebean, String>
{

	List<Routebean> findByRouteId(String shipId);

}