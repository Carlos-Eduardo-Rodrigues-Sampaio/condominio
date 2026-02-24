package com.senac.inicial.service;

import com.senac.inicial.entity.Usuario;
import com.senac.inicial.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository UsuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        UsuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios(){
        return UsuarioRepository.findAll();
    }

    public Usuario obterUsuarioPeloID(Integer id){
        return UsuarioRepository.findById(id).orElse(null);
    }
}
