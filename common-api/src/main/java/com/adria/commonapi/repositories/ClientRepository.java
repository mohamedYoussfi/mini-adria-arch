package com.adria.commonapi.repositories;

import com.adria.commonapi.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
