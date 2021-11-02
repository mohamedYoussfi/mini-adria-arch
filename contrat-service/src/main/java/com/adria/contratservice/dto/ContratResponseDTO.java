package com.adria.contratservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ContratResponseDTO {
    private Long id;
    private String nom;
    private Date date;
    private String nomClient;
}
