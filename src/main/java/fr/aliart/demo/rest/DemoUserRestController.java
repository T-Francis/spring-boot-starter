package fr.aliart.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.aliart.demo.dao.repository.DemoUserRepository;
import fr.aliart.demo.model.DemoUserModel;

import java.util.List;

@RestController
@RequestMapping(value = "/demo/rest//user")
public class DemoUserRestController {

    @Autowired
    DemoUserRepository demoUserRepository;

    @GetMapping("/all")
    public List<DemoUserModel> getAll() {
        return demoUserRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<DemoUserModel> getUser(@PathVariable("name") final String firstName) {
        return demoUserRepository.findByFirstName(firstName);

    }

    @GetMapping("/id/{id}")
    public DemoUserModel getId(@PathVariable("id") final Integer id) {
        return demoUserRepository.findOne(id);
    }

    @GetMapping("/update/{id}/{name}")
    public DemoUserModel update(@PathVariable("id") final Integer id, @PathVariable("firstName") final String firstName) {

    	DemoUserModel users = getId(id);
        users.setFirstName(firstName);

        return demoUserRepository.save(users);
    }
}
