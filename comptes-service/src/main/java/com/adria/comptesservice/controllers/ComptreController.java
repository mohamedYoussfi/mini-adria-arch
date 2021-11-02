package com.adria.comptesservice.controllers;

import com.adria.comptesservice.dto.CompteResponseDTO;
import com.adria.comptesservice.dto.CreateCompteRequestDTO;
import com.adria.comptesservice.service.CompteService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComptreController {
    private CompteService compteService;

    public ComptreController(CompteService compteService) {
        this.compteService = compteService;
    }
    @PostMapping(path = "/comptes")
    public CompteResponseDTO save(@RequestBody CreateCompteRequestDTO request){
        return compteService.addNewCompte(request);
    }
    @GetMapping(path = "/comptes/{id}")
    public  CompteResponseDTO getCompte(@PathVariable Long id){
        return compteService.getCompte(id);
    }
}
