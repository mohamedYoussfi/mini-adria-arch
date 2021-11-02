package com.adria.comptesservice.dto;

import lombok.Data;

import java.util.Date;
@Data
public class CompteResponseDTO {
    private Long id;
    private String type;
    private double solde;
    private Date dateCreation;
    private Long idContrat;
    private String titreContrat;
    private String nomClient;

}
