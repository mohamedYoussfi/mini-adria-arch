package com.adria.contratservice.mappers;

import com.adria.commonapi.entities.Contrat;
import com.adria.contratservice.dto.ContratRequestDTO;
import com.adria.contratservice.dto.ContratResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ContratMapper {
    @Mappings({
            @Mapping(source = "nomClient",target = "client.nom")
    })
    public Contrat from(ContratRequestDTO requestDTO);
    @Mappings({
            @Mapping(source = "client.nom",target = "nomClient"),
            @Mapping(source = "titre",target = "nom")
    })
    public ContratResponseDTO from(Contrat contrat);
}
