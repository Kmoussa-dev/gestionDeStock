package com.Kmous.gestionDeStock.repository;

import com.Kmous.gestionDeStock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Integer, Ventes> {
}
