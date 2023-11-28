package br.com.projetovai.api.service;

import br.com.projetovai.api.entity.Instituicao;
import br.com.projetovai.api.repository.InstituicaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstituicaoService {
    private final InstituicaoRepository repository;
    public Instituicao criarInstituicao(Instituicao instituicao) {
        var inserted = repository.save(instituicao);
        return inserted;
    }
}
