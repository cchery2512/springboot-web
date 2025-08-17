package com.cchery.curso.springboot.webapp.springboot_web.http.resources;

import java.util.HashMap;
import java.util.Map;

import com.cchery.curso.springboot.webapp.springboot_web.models.User;

public class DetailsResource {
    private static Map<String, Object> filteredBody = new HashMap<>();

    public static Map<String, Object> make(Map<String, Object> body){
        filteredBody.put("titulo", body.get("title"));
        filteredBody.put("usuario", UserResource.make((User) body.get("user")));
        return filteredBody;
    }
}
