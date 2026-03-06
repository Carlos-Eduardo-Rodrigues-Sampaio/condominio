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

    @GetMapping("/listarUsuarios")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return new ResponseEntity<>(usuarioService.listarUsuarios(), httpStatus.OK);
    }

    @GetMapping("/ObterUsuarioPeloId/{idUsuario}")
    public ResponseEntity<Usuario> oberUsuariosPeloId(@PathVariable Integer idUsuario) {
        return ResponseEntity.ok(usuarioService.obterUsuarioPeloID(idUsuario));
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
