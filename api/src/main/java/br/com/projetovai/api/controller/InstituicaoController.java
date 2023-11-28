package br.com.projetovai.api.controller;

import br.com.projetovai.api.entity.Aluno;
import br.com.projetovai.api.entity.Instituicao;
import br.com.projetovai.api.service.InstituicaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/Instituicao"})
public class InstituicaoController {
    private final InstituicaoService service;

    @PostMapping({"/criar"})
    public ResponseEntity<Instituicao> criarInstituicao(@RequestBody Instituicao instituicao){
        var inserted = service.criarInstituicao(instituicao);
        return new ResponseEntity<>(inserted, HttpStatus.CREATED);
    }
}
