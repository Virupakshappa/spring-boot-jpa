package com.janadri.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping("getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("getAlien.jsp");
		Alien alien = dao.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
		
	}
}
