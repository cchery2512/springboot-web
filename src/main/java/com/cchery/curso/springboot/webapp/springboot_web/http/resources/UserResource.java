package com.cchery.curso.springboot.webapp.springboot_web.http.resources;

import java.util.HashMap;
import java.util.Map;

import com.cchery.curso.springboot.webapp.springboot_web.models.User;

public class UserResource {
    private static Map<String, Object> filteredBody = new HashMap<>();
    
    public static Map<String, Object> make(User user) {
        filteredBody.put("nombre", user.getName());
        filteredBody.put("apellido", user.getLastname());
        return filteredBody;
    }
}
