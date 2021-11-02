package com.adria.comptesservice.dto;

import lombok.Data;

@Data
public class CreateCompteRequestDTO {
    private double soldeIntial;
    private String type;
    private Long idContrat;
}
