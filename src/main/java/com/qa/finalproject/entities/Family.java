package com.qa.finalproject.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Family {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Father", nullable = false)
	private String father;
	
	@Column(nullable = false)
	private String mother;
	
	@Column(nullable = false, unique = true)
	private String child;
	
	public Family() {}
	
	public Family (String father, String mother, String child) {
		
		super();
		this.father = father;
		this.mother = mother;
		this.child = child;
	}
	
	public Family(long id, String father, String mother, String child) {
		super();
		this.id = id;
		this.father = father;
		this.mother = mother;
		this.child = child;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		
	}
	
	public String getFather() {
		return father;
		
	}
	
	public void setFather(String father) {
		this.father = father;
	}
	
	public String getMother(String mother) {
		return mother;	
	}
	
	public void setMother(String mother) {
		
	}
	
	public String getChild() {
		return child;
	}
	
	public void setChild(String child) {
		this.child = child;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(father, mother, child, id);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Family other = (Family) obj;
		return Objects.equals(child, other.child) && Objects.equals(father, other.father) && id == other.id
				&& Objects.equals(mother, other.mother);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
