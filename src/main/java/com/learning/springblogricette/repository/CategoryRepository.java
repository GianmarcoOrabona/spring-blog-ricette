package com.learning.springblogricette.repository;

import com.learning.springblogricette.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
