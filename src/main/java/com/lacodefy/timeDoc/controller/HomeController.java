package com.lacodefy.timeDoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@GetMapping("/")
//	public ResponseEntity<?> index() {
//		ModelAndView modelAndView = new ModelAndView("login");
//		return new ResponseEntity<ModelAndView>(modelAndView, HttpStatus.OK);
//	}

	@GetMapping("/")
	public ModelAndView index() {
		final ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}

}
