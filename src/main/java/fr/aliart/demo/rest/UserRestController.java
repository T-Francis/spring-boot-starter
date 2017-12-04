package fr.aliart.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.aliart.demo.dao.repository.DemoUserRepository;
import fr.aliart.demo.model.UserModel;

import java.util.List;

@RestController
@RequestMapping(value = "/demo/rest//user")
public class UserRestController {

    @Autowired
    DemoUserRepository demoUserRepository;

    @GetMapping("/all")
    public List<UserModel> getAll() {
        return demoUserRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<UserModel> getUser(@PathVariable("name") final String firstName) {
        return demoUserRepository.findByFirstName(firstName);

    }

    @GetMapping("/id/{id}")
    public UserModel getId(@PathVariable("id") final Integer id) {
        return demoUserRepository.findOne(id);
    }

    @GetMapping("/update/{id}/{name}")
    public UserModel update(@PathVariable("id") final Integer id, @PathVariable("firstName") final String firstName) {

    	UserModel users = getId(id);
        users.setFirstName(firstName);

        return demoUserRepository.save(users);
    }
}
