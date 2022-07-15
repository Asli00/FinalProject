package com.qa.finalproject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.finalproject.entities.Family;

@Repository
public interface FamilyRepo extends JpaRepository<Family, Long> {
	
	List<Family> findFamilyByFather(String father);
	

}
