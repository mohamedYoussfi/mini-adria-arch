package com.adria.comptesservice.mappers;

import com.adria.commonapi.entities.Compte;
import com.adria.comptesservice.dto.CompteResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CompteMapper {
    @Mappings({
            @Mapping(source = "contrat.id",target = "idContrat"),
            @Mapping(source = "contrat.titre",target = "titreContrat"),
            @Mapping(source = "contrat.client.nom",target = "nomClient"),
            @Mapping(source = "code",target = "id"),
    }
    )
    public CompteResponseDTO frm(Compte compte);
}
