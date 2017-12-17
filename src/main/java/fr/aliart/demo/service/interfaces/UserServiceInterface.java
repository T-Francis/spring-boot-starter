package fr.aliart.demo.service.interfaces;

import java.util.List;
import org.springframework.stereotype.Service;
import fr.aliart.demo.model.UserModel;

@Service
public interface UserServiceInterface {
	
	List<UserModel> findAll();
	
	List<UserModel> findByFirstName(String firstName);

	UserModel save(UserModel user);

	
}
