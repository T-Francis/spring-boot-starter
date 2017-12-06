package fr.aliart.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.demo.dao.UserDao;
import fr.aliart.demo.model.UserModel;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
    public UserService() {
    }

	public List<UserModel> findAll() {
		return userDao.findAll();
	}
	
	public UserModel findOne(Long id) {
		return userDao.findOne(id);
	}

	public List<UserModel> findByFirstName(String firstName) {
		return userDao.findByFirstName(firstName);
	}

	public UserModel save(UserModel user) {
		return userDao.save(user);
	}

	
}
