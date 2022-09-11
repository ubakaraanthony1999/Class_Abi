package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
	
	@GetMapping("/")
	public String test() {
	return "Welcome";	
	}

    @GetMapping("/sub1")
	public String test1() {
	return "Spring boot";	
	}
    
	@ResponseBody
    @GetMapping("/sub2")
	public String test2() {
	return "Jenkins";	
	}
    
	@ResponseBody
    @GetMapping("/sub3")
	public String test3() {
	return "Docker";	
	}
    
	@ResponseBody
    @GetMapping("/sub4")
	public String test4() {
	return "EC2 Instance";	
	}
	
}




//POST - Insert
//PUT - Update
//DELETE - Delete
//GET - Read
