package com.cchery.curso.springboot.webapp.springboot_web.http.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cchery.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("name", "Carmelo");
        model.addAttribute("lastname", "Chery");
        model.addAttribute("email", "carmelo@correo.com");
        return "details";
    }

    @GetMapping("/list")
    public String details(ModelMap model){
        model.addAttribute("title", "Listado de Usuarios!");
        return "list";
    }

    //Permite pasar datos a la vista (preferible para datos genéricos)
    @ModelAttribute("users")
    public List<User> userModUsers(){
        User user = new User("Carmelo", "Chery", "cchery@test.com");
        User user2 = new User("Lázaro", "Ríos");
        User user3 = new User("Bethel", "Chery", "beth@test.com");
        List<User> users = Arrays.asList(user, user2, user3);
        return users;
    }
}
