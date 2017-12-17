package fr.aliart.demo.dao.interfaces;

import java.util.List;
import org.springframework.stereotype.Component;
import fr.aliart.demo.model.UserModel;

@Component
public interface UserDaoInterface {

	List<UserModel> findAll();
    
    List<UserModel> findByFirstName(String firstName);
	
	UserModel save(UserModel user);
}
