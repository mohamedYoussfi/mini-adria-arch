package com.adria.contratservice.controllers;

import com.adria.contratservice.dto.ContratRequestDTO;
import com.adria.contratservice.dto.ContratResponseDTO;
import com.adria.contratservice.service.ContratService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContratRestController {
    private ContratService contratService;

    public ContratRestController(ContratService contratService) {
        this.contratService = contratService;
    }
    @PostMapping(path="/contrats")
    public ContratResponseDTO addContrat(@RequestBody ContratRequestDTO request){
        return contratService.saveContrat(request);
    }

    @GetMapping(path = "/contrats/{id}")
    public ContratResponseDTO getConttat(@PathVariable Long id){

        return contratService.getContat(id);
    }
}
