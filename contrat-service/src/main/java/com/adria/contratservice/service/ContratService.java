package com.adria.contratservice.service;

import com.adria.contratservice.dto.ContratRequestDTO;
import com.adria.contratservice.dto.ContratResponseDTO;

public interface ContratService {
    ContratResponseDTO saveContrat(ContratRequestDTO request);
    ContratResponseDTO getContat(Long id);
}
