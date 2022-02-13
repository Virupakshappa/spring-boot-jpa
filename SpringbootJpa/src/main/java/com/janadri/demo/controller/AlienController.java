package com.janadri.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.janadri.demo.dao.AlienDao;
import com.janadri.demo.model.Alien;

@Controller
public class AlienController {

@Autowired
AlienDao dao;
	
	@RequestMapping("/")
	public String home() {
		
		return  "home.jsp";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		dao.save(alien);
		return "return.jsp";
		
	}
}
