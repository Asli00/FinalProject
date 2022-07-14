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

import antlr.collections.List;

@RestController
@RequestMapping("/family")
public class FamilyController {

	private List <family> family = new ArrayList<>();
	
	@GetMapping("/readAll")
	public List readALL() {
		return this.family;
		
	}
	
	@GetMapping("/readById/{id")
	public Family readById(@PathVariable int id) {
		return this.family.get(id);
	}
	
	@PostMapping("/create")
	public Family craete(@RequestBody Family family) {
		
	}
	
    @PutMapping("/update/{id}")
	public Family update(@PathVariable int id, @RequestBody Family family) {
    	this.family.remove(id);
    	this.family.add(id, family);
    	return this.family.get(id);
    	
    }
	
    @DeleteMapping
    public Family delete(@PathVariable int id) {
    	
    }
	
	
	
	
	
	
	
}
