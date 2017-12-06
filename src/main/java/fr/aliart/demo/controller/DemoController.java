package fr.aliart.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/")
public class DemoController {
	
    public String helloWorld(ModelMap model) {
        return "base";
    }
    
    @GetMapping("/{name}")
    public String helloWorldWithName(ModelMap model, @PathVariable("name") String name) {
        model.addAttribute("name", name);
        return "base";
    }

}