package fr.aliart.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.demo.dao.UserDao;
import fr.aliart.demo.model.UserModel;
import fr.aliart.demo.service.interfaces.UserServiceInterface;

@Service
public class UserService implements UserServiceInterface{
	
	@Autowired
	UserDao userDao;
	
    public UserService() {
    }

	public List<UserModel> findAll() {
		return userDao.findAll();
	}  
	
	public List<UserModel> findByFirstName(String firstName) {
		return userDao.findByFirstName(firstName);
	}

	public UserModel save(UserModel user) {
		return userDao.save(user);
	}
	
}
