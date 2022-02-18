package com.janadri.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.janadri.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

	List<Alien> findByAname(String aname);
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where aname=?1 order by aname")
	List<Alien> findByAnameSorted(String aname);
}
