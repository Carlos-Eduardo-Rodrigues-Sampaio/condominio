package com.senac.inicial.controller;

import com.senac.inicial.entity.Empresa;
import com.senac.inicial.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/empresa")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping ("/listarEmpresas")
    public String listarEmpresas() {
        return "REST endpoint está funcionando";
    }

    @GetMapping("/ObterEmpresaPeloId/{idEmpresa}")
    public Empresa obterEmpresaPeloId(@PathVariable Integer idEmpresa) {
        return empresaService.obterEmpresaPeloId(idEmpresa);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String adicionarEmpresa() {
        return "Empresa adicionada";
    }

    @DeleteMapping("/apagarEmpresa")
    public String apagarEmpresa() {
        return "Empresa Apagada";
    }
}
