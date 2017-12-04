package fr.aliart.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.aliart.demo.model.UserModel;

import java.util.List;

public interface DemoUserRepository extends JpaRepository<UserModel, Integer> {
	
	 List<UserModel> findByFirstName(String firstName);
	 
}