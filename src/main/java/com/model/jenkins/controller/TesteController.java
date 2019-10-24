package com.model.jenkins.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/helloworld")
public class TesteController {

	@GetMapping
	public String pesquisar() {
		System.out.println("Inside secured()");
		return "Hello user !!! : " + new Date();
	}

}
