package com.adria.comptesservice.service;

import com.adria.commonapi.entities.Compte;
import com.adria.commonapi.entities.Contrat;
import com.adria.commonapi.enums.TypeCompte;
import com.adria.commonapi.repositories.CompteRepository;
import com.adria.comptesservice.dto.CompteResponseDTO;
import com.adria.comptesservice.dto.ContratResponseDTO;
import com.adria.comptesservice.dto.CreateCompteRequestDTO;
import com.adria.comptesservice.feign.ContratRestClient;
import com.adria.comptesservice.mappers.CompteMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {
    private CompteRepository compteRepository;
    private ContratRestClient contratRestClient;
    private CompteMapper compteMapper;

    public CompteServiceImpl(CompteRepository compteRepository, ContratRestClient contratRestClient, CompteMapper compteMapper) {
        this.compteRepository = compteRepository;
        this.contratRestClient = contratRestClient;
        this.compteMapper = compteMapper;
    }

    @Override
    public CompteResponseDTO addNewCompte(CreateCompteRequestDTO requestDTO) {
        ContratResponseDTO contratResponseDTO=contratRestClient.getContrat(requestDTO.getIdContrat());
        // Règles métiers
        Contrat contrat=new Contrat();
        contrat.setId(contratResponseDTO.getId());

        Compte compte=new Compte();
        compte.setSolde(requestDTO.getSoldeIntial());
        compte.setDateCreation(new Date());
        compte.setType(requestDTO.getType().equals("courant")? TypeCompte.COURANT:TypeCompte.EPARGNE);
        compte.setContrat(contrat);
        Compte saveCompte = compteRepository.save(compte);

        CompteResponseDTO compteRespDTO = compteMapper.frm(saveCompte);
        compteRespDTO.setNomClient(contratResponseDTO.getNomClient());
        compteRespDTO.setTitreContrat(contratResponseDTO.getNom());
        return compteMapper.frm(saveCompte);
    }

    @Override
    public CompteResponseDTO getCompte(Long id) {
        Compte compte=compteRepository.findById(id).get();
        return compteMapper.frm(compte);
    }
}
