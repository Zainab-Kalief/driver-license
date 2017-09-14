package com.wura.driverLicense.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wura.driverLicense.models.License;
import com.wura.driverLicense.models.Person;
import com.wura.driverLicense.services.DriverService;

@Controller
public class DriverController {
	private final DriverService service;
	public DriverController(DriverService service) {
		this.service = service;
	}
	@RequestMapping("/")
	public String all(Model model) {
		model.addAttribute("all", service.all());
		return "home";
	}
	@RequestMapping("/person")
	public String person(@ModelAttribute("newPerson") Person person) {
		return "person";
	}
	@PostMapping("/person")
	public String addPerson(@Valid @ModelAttribute("newPerson") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "person";
		}
		service.addPerson(person);
		return "redirect:/person";
	}
	
	@RequestMapping("/license")
	public String license(@ModelAttribute("newLicense") License license, Model model) {
		model.addAttribute("people", service.allPersons());
		return "license";
	}
	@PostMapping("/license")
	public String addLicense(@Valid @ModelAttribute("newLicense") License license, BindingResult result, HttpSession session, Model model) {
		if(result.hasErrors()) {
			return "redirect:/license";
		}
		if(session.getAttribute("number") == null) {
			session.setAttribute("number", 00000);
		}
		Integer number = (Integer) session.getAttribute("number");
		number += 1;
		session.setAttribute("number", number);
		license.setNumber(number);
		service.addLicense(license);		
		return "redirect:/";
	}
	
	@RequestMapping("/person/{id}")
	public String find(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", service.findLicense(id));
		return "find";
	}
}
