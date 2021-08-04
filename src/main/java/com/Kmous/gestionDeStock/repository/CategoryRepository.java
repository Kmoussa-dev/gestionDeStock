package com.Kmous.gestionDeStock.repository;

import com.Kmous.gestionDeStock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Integer, Category> {
}
