package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.UsuarioRequest;
import com.example.demo.Models.UsuarioResponse;

@RestController
public class UsuarioController {
    
    @PostMapping("/usuario")
    public UsuarioResponse CrearUsuario(@RequestBody UsuarioRequest request)
    {
        UsuarioResponse data = new UsuarioResponse();
        data.nombre = "Hola";
        data.apellido = request.nombre;
        return data;
    }
}
