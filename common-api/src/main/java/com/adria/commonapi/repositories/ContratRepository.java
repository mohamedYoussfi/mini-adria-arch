package com.adria.commonapi.repositories;

import com.adria.commonapi.entities.Client;
import com.adria.commonapi.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
