package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitController {
	
	@RequestMapping("/hello")
	public String gitDemo(){
		return "hrllo git";
	}
	
	public String git(){
		System.out.println("git!git!git!git!");
		return null;
	}
	
	@GetMapping
	public String gitDev(){
		return "dev";
	}
	
}
