package com.janadri.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.janadri.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

	List<Alien> findByAname(String aname);
	List<Alien> findByAidGreaterThan(int aid);
}
