package com.c417.jenkins.chocofactory.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c417.jenkins.chocofactory.model.ChocolateRequest;
import com.c417.jenkins.chocofactory.model.ChocolateResponse;

@RestController
@RequestMapping(value = "chocolate", produces = "application/json")
public class ChocolateController {
	
	@PostMapping
	public ChocolateResponse postChoco(
			@Valid @RequestBody ChocolateRequest request){
		
		ChocolateResponse response = new ChocolateResponse();
		response.setResultStatus("Success");
		return response;
	}

}
