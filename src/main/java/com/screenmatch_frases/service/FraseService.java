package com.screenmatch_frases.service;

import com.screenmatch_frases.dto.FraseDTO;
import com.screenmatch_frases.model.Frase;
import com.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getPoster());
    }
}
