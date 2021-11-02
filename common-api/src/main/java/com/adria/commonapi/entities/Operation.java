package com.adria.commonapi.entities;

import com.adria.commonapi.enums.TypeOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Operation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double montant;
    @Enumerated(EnumType.STRING)
    private TypeOperation type;
    @ManyToOne
    private Compte compte;

}
