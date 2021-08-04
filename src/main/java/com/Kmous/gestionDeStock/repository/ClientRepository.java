package com.Kmous.gestionDeStock.repository;

import com.Kmous.gestionDeStock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
