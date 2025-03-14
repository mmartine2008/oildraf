package com.oildraf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private boolean checkUserPassword(String nombreUsuario, String password) {

        return (nombreUsuario.equals("admin")) && (password.equals("admin"));
    }

    @PostMapping("/validate")
    public ResponseEntity<ApiResponse>  validar(@RequestBody Map<String, Object> datos) {
        if (!datos.containsKey("nombre") || !datos.containsKey("password")) {
            return ResponseEntity.badRequest().body(new ApiResponse(false, "Faltan datos obligatorios"));
        }

        String nombre = (String) datos.get("nombre");
        String password = (String) datos.get("password");

        if (this.checkUserPassword(nombre, password)) {
            return ResponseEntity.ok(new ApiResponse(true, "Usuario " + nombre + " con password "+ password+" es correcto"));    
        } else {
            return ResponseEntity.badRequest().body(new ApiResponse(false, "Usuario " + nombre + " con password "+ password +" es incorrecto"));
        }

        // Aquí podrías guardar el usuario en la base de datos
        
    }

}
