package br.com.projetovai.api.controller;

import br.com.projetovai.api.entity.Aluno;
import br.com.projetovai.api.entity.ONG;
import br.com.projetovai.api.service.AlunoService;
import br.com.projetovai.api.service.ONGService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/ONG"})
public class ONGController {
    private final ONGService service;

    @PostMapping({"/criar"})
    public ResponseEntity<ONG> criarAluno(@RequestBody ONG ong){
        var inserted = service.criarONG(ong);
        return new ResponseEntity<>(inserted, HttpStatus.CREATED);
    }
}
