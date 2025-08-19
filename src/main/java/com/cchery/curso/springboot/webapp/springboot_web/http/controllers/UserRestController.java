package com.cchery.curso.springboot.webapp.springboot_web.http.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cchery.curso.springboot.webapp.springboot_web.http.resources.DetailsResource;
import com.cchery.curso.springboot.webapp.springboot_web.models.User;
import com.cchery.curso.springboot.webapp.springboot_web.models.dto.UserDto;

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

    @GetMapping("/details-dto")
    public UserDto detailsDto(){
        UserDto userDto = new UserDto();
        User user = new User("Carmelo", "Chery");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/user-list")
    public List<User> list(){
        User user = new User("Carmelo", "Chery");
        User user2 = new User("Carmelo", "Chery");
        User user3 = new User("Carmelo", "Chery");
        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        return users;
    }
}
