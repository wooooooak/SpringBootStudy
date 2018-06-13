package com.appress.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appress.spring.repository.JournalRepository;

@Controller
public class JournalController {
	
	@Autowired
	JournalRepository repo;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("journal", repo.findAll());
		return "index";
	}
}
