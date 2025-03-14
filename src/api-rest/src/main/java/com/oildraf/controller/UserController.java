package com.oildraf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/validate")
    public String validar(@RequestBody Map<String, Object> datos) {
        String nombre = (String) datos.get("nombre");
        String password = (String) datos.get("password");

        return "Usuario " + nombre + " con password " + password + ".";

    }

}
