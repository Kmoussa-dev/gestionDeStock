package com.Kmous.gestionDeStock.repository;

import com.Kmous.gestionDeStock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Integer, Entreprise> {
}
