package fr.aliart.demo.controller.rest;

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

    @GetMapping("/{firstName}")
    public List<UserModel> getUser(@PathVariable("firstName") final String firstName) {
        return userService.findByFirstName(firstName);

    }

}
