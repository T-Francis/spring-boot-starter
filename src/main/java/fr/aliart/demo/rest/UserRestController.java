package fr.aliart.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.aliart.demo.model.UserModel;
import fr.aliart.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/user")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<UserModel> getAll() {
        return userService.findAll();
    }

    @GetMapping("/{name}")
    public List<UserModel> getUser(@PathVariable("name") final String firstName) {
        return userService.findByFirstName(firstName);

    }

    @GetMapping("/id/{id}")
    public UserModel getId(@PathVariable("id") final Long id) {
        return userService.findOne(id);
    }

    @GetMapping("/update/{id}/{name}")
    public UserModel update(@PathVariable("id") final Long id, @PathVariable("firstName") final String firstName) {

    	UserModel user = getId(id);
        user.setFirstName(firstName);

        return userService.save(user);
    }
}
