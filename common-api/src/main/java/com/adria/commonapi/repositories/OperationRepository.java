package com.adria.commonapi.repositories;

import com.adria.commonapi.entities.Client;
import com.adria.commonapi.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Long> {
}
