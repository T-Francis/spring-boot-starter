package fr.aliart.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.aliart.demo.model.UserModel;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	 List<UserModel> findAll();

	 List<UserModel> findByFirstName(String firstName);
	 
	 UserModel save(UserModel user);
	 
}