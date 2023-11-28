package br.com.projetovai.api.controller;

import br.com.projetovai.api.entity.Aluno;
import br.com.projetovai.api.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/aluno"})
public class AlunoController {
    private final AlunoService service;

    @PostMapping({"/criar"})
    public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno){
        var inserted = service.criarAluno(aluno);
        return new ResponseEntity<>(inserted, HttpStatus.CREATED);
    }
}
