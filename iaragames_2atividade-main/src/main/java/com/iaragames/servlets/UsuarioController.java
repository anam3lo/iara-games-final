package com.iaragames.controller;

import com.iaragames.dao.UsuarioDAO;
import com.iaragames.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return UsuarioDAO.getAllUsuarios();
    }

    @PostMapping
    public void saveUsuario(@RequestBody Usuario usuario) {
        UsuarioDAO.saveUsuario(usuario);
    }
}