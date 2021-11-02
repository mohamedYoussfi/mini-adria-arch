package com.adria.comptesservice.feign;

import com.adria.commonapi.entities.Contrat;
import com.adria.comptesservice.dto.ContratResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CONTRAT-SERVICE")
public interface ContratRestClient {
    @GetMapping(path = "/contrats/{id}")
    public ContratResponseDTO getContrat(@PathVariable Long id);
}
