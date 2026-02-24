package com.senac.inicial.service;

import com.senac.inicial.entity.Empresa;
import com.senac.inicial.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private final EmpresaRepository EmpresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        EmpresaRepository = empresaRepository;
    }

    public List<Empresa> listarEmpresas(){
        return EmpresaRepository.findAll();
    }

    public Empresa obterEmpresaPeloId(Integer id){
        return EmpresaRepository.findById(id).orElse(null);
    }
}
