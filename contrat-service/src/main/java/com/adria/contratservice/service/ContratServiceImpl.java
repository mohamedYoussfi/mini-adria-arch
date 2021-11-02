package com.adria.contratservice.service;

import com.adria.commonapi.entities.Client;
import com.adria.commonapi.entities.Contrat;
import com.adria.commonapi.repositories.ClientRepository;
import com.adria.commonapi.repositories.ContratRepository;
import com.adria.contratservice.dto.ContratRequestDTO;
import com.adria.contratservice.dto.ContratResponseDTO;
import com.adria.contratservice.mappers.ContratMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ContratServiceImpl implements ContratService {
    private ContratRepository contratRepository;
    private ClientRepository clientRepository;
    private ContratMapper contratMapper;

    public ContratServiceImpl(ContratRepository contratRepository, ClientRepository clientRepository, ContratMapper contratMapper) {
        this.contratRepository = contratRepository;
        this.clientRepository = clientRepository;
        this.contratMapper = contratMapper;
    }

    @Override
    public ContratResponseDTO saveContrat(ContratRequestDTO request) {
        Contrat contrat=contratMapper.from(request);
        Client client=contrat.getClient();
        Client saveClient = clientRepository.save(client);
        contrat.setClient(saveClient);
        contrat.setDate(new Date());
        Contrat savedContrat=contratRepository.save(contrat);
        return contratMapper.from(savedContrat);
    }

    @Override
    public ContratResponseDTO getContat(Long id) {
        Contrat contrat=contratRepository.findById(id).get();
        return contratMapper.from(contrat);
    }
}
