package br.com.projetovai.api.service;

import br.com.projetovai.api.entity.ONG;
import br.com.projetovai.api.repository.ONGRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ONGService {
    private final ONGRepository repository;
    public ONG criarONG(ONG ong) {
        var inserted = repository.save(ong);
        return inserted;
    }
}
