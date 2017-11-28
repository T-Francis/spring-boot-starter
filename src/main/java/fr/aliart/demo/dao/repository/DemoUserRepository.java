package fr.aliart.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.aliart.demo.model.DemoUserModel;

import java.util.List;

public interface DemoUserRepository extends JpaRepository<DemoUserModel, Integer> {
	
	 List<DemoUserModel> findByFirstName(String firstName);
	 
}