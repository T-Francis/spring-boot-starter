package fr.aliart.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.demo.dao.repository.UserRepository;
import fr.aliart.demo.model.UserModel;

@Component
public class UserDao {

	@Autowired
	UserRepository userRepository;
	
    public UserDao() {
    }

	public List<UserModel> findAll() {
    	return userRepository.findAll();
	}

	public UserModel findOne(Long id) {
    	return userRepository.findOne(id);
	}
	
	public List<UserModel> findByFirstName(String firstName) {
    	return userRepository.findByFirstName(firstName);
	}
	
	public UserModel save(UserModel user) {
    	return userRepository.save(user);
	}
	
}
