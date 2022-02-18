package com.janadri.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.janadri.demo.dao.AlienRepo;
import com.janadri.demo.model.Alien;

@Controller
public class AlienController {

@Autowired
AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return  "home.jsp";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "return.jsp";
		
	}
	@RequestMapping("getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("getAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		
		System.out.println(repo.findByAname("veeru"));
		System.out.println("================================================");
		System.out.println(repo.findByAidGreaterThan(1));
		System.out.println("================================================");
		System.out.println(repo.findByAnameSorted("veeru"));
		mv.addObject(alien);
		return mv;
		
	}
}