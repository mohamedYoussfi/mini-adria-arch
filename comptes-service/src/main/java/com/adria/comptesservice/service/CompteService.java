package com.adria.comptesservice.service;

import com.adria.comptesservice.dto.CompteResponseDTO;
import com.adria.comptesservice.dto.CreateCompteRequestDTO;

public interface CompteService {
    public CompteResponseDTO addNewCompte(CreateCompteRequestDTO requestDTO);
    public CompteResponseDTO getCompte(Long id);
}
