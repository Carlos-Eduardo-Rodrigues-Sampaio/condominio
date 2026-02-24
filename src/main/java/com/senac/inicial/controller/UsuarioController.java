package com.senac.inicial.controller;

import com.senac.inicial.entity.Usuario;
import com.senac.inicial.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/listarUsuario")
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/ObterUsuarioPeloId/{idUsuario}")
    public Usuario oberUsuariosPeloId(@PathVariable Integer idUsuario) {
        return usuarioService.obterUsuarioPeloID(idUsuario);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String adicionarUsuario() {
        return "Usuário adicionado";
    }

    @PutMapping ("/atualizarUsuario")
    public String atyalizarUsuario() {
        return "Usuário atualizado";
    }

    @DeleteMapping ("/apagarUsuario")
    public String apagarusuario() {
        return "Usuário apagado";
    }
}
