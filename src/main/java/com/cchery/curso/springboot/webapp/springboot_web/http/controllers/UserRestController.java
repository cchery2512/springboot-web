package com.cchery.curso.springboot.webapp.springboot_web.http.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cchery.curso.springboot.webapp.springboot_web.http.resources.DetailsResource;
import com.cchery.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public Map<String, Object> details(){
        User user = new User("Carmelo", "Chery");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        //body.put("name", "Carmelo");
        //body.put("lastname", "Chery");
        return DetailsResource.make(body);
        //return body;
    }
}
