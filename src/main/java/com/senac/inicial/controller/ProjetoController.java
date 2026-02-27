package com.senac.inicial.controller;

import com.senac.inicial.entity.Projeto;
import com.senac.inicial.service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "api/projeto")
//@CrossOrigin("*")
public class ProjetoController {

    private final ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping("/listarProjetos")
    public List<Projeto> listarProjetos() {
        return projetoService.listarProjetos();
    }

    @GetMapping("/ObterProjetoPeloId/{idProjeto}")
    public Projeto obterProjetoPeloId(@PathVariable Integer idProjeto) {
        return projetoService.obterProjetoPeloId(idProjeto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String adicionarProjeto(){
        return "Projeto adicionado";
    }

    @DeleteMapping("/apagarProjeto" )
    public String apagarProjeto() {
        return "Projeto Apagado";
    }

}
