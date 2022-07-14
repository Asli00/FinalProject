package com.qa.finalproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.finalproject.entities.Family;
import com.qa.finalproject.repos.FamilyRepo;

@Service
public class FamilyServices {
	
	private FamilyRepo repo;
	
	public FamilyServices(FamilyRepo repo) {
		this.repo = repo;
		
	}
	
	public List<Family> readAll() {
		return this.repo.findAll();
		
	}
	
	public Family readById(long id) {
		return this.repo.findById(id).get();
	}
	
	public List<Family> readByFather(String Father) {
		return this.repo.findFamilyByFather(Father);
		
	}
	
	public Family create(Family family) {
		return this.repo.saveAndFlush(family);
		
	}
	
	public Family update(long id, Family family) {
		
		Family existing = this.repo.findById(id).get();
		
		existing.setFather(family.getFather());
		existing.setMother(family.getMother());
		existing.setChild(family.getChild());
		
		return this.repo.saveAndFlush(existing);
		
	}
	
	public boolean delete(long id) {
		this.repo.deleteById(id);
		
		
		return !this.repo.existsById(id);
	}
	


	
	
	
	
	
	
}
