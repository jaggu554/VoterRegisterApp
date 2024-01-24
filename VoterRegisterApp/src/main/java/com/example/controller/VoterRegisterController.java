package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.binding.VoteRegister;
import com.example.service.VoterRegistrationService;

@Controller
public class VoterRegisterController {
	@Autowired
private VoterRegistrationService service;
	@GetMapping("/")
	public String getLoadForm(Model model) {
		
		init(model);
		return "apply";
	}
	
	public void init(Model model) {
		model.addAttribute("voter", new VoteRegister());
		
	}
	
	@PostMapping("/save")
	public String saveData(VoteRegister v,Model model) {
		//System.out.println(v);
		service.SaveData(v);
		model.addAttribute("msg", "Data Registered...");
		init(model);
		return "apply";
	}
}
