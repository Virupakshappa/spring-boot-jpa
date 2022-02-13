package com.janadri.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.janadri.demo.model.Alien;

public interface AlienDao extends CrudRepository<Alien, Integer>{

}
