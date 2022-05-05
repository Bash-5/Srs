package com.example.demo.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Routebean;
import com.example.demo.bean.Schedulebean;

public interface ScheduleRepo extends CrudRepository<Schedulebean, String>
{

	List<Schedulebean> findByScheduleId(String scheduleId);


}
