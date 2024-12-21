package com.screenmatch_frases.controller;

import com.screenmatch_frases.dto.FraseDTO;
import com.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FrasesController {
    @Autowired
    private FraseService fraseService;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        return fraseService.obterFraseAleatoria();
    }
}
