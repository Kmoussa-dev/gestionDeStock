package com.Kmous.gestionDeStock.repository;

import com.Kmous.gestionDeStock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
