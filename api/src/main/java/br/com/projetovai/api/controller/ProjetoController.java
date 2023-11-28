package br.com.projetovai.api.controller;

import br.com.projetovai.api.entity.Aluno;
import br.com.projetovai.api.entity.Projeto;
import br.com.projetovai.api.service.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/projeto"})
public class ProjetoController {
    private final ProjetoService service;

    @PostMapping({"/criar"})
    public ResponseEntity<Projeto> criarProjeto(@RequestBody Projeto projeto){
        var inserted = service.criarProjeto(projeto);
        return new ResponseEntity<>(inserted, HttpStatus.CREATED);
    }
}
