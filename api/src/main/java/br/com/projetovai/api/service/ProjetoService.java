package br.com.projetovai.api.service;

import br.com.projetovai.api.entity.Aluno;
import br.com.projetovai.api.entity.Projeto;
import br.com.projetovai.api.repository.ProjetoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjetoService {
    private final ProjetoRepository repository;

    public Projeto criarProjeto(Projeto projeto) {
        var inserted = repository.save(projeto);
        return inserted;
    }
}
