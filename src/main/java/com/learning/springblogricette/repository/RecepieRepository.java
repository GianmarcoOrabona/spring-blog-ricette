package com.learning.springblogricette.repository;

import com.learning.springblogricette.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecepieRepository extends JpaRepository<Recipe, Integer> {
}
