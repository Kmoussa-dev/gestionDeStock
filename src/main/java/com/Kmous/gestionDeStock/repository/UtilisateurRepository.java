package com.Kmous.gestionDeStock.repository;

import com.Kmous.gestionDeStock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Integer, Utilisateur> {
}
