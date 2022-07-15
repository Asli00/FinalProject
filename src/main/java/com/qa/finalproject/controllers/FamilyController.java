package com.qa.finalproject.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.finalproject.entities.Family;
import com.qa.finalproject.services.FamilyServices;

import antlr.collections.List;

@RestController
@RequestMapping("/family")
public class FamilyController {

	private FamilyServices service;
	
	public FamilyController(FamilyServices service) {
		this.service = service;
		
	}
	
	@GetMapping("/readAll")
	public List<Family> readALL() {
		return this.service.readAll();
		
	}
	
	@GetMapping("/readById/{id")
	public Family readById(@PathVariable long id) {
		return this.service.readById(id);
	}


	
	@PostMapping("/create")
	public Family craete(@RequestBody Family family) {
		return this.service.create(family);
	}
	
    @PutMapping("/update/{id}")
	public Family update(@PathVariable long id, @RequestBody Family family) {
    	return this.service.update(id, family);	
    }
	
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id) {
    	return this.service.delete(id);
    }
	
	
	
	
	
	
	
}
