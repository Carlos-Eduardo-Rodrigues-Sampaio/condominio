package com.senac.inicial.service;

import com.senac.inicial.entity.Projeto;
import com.senac.inicial.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
        private final ProjetoRepository ProjetoRepository;

        public ProjetoService(ProjetoRepository projetoRepository){
            ProjetoRepository = projetoRepository;
        }

        public List<Projeto> listarProjetos(){
            return ProjetoRepository.findAll();
        }

        public Projeto obterProjetoPeloId(Integer id){
            return ProjetoRepository.findById(id).orElse(null);
        }

}
