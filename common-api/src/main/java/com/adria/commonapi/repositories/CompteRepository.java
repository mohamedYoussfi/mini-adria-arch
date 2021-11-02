package com.adria.commonapi.repositories;

import com.adria.commonapi.entities.Client;
import com.adria.commonapi.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
