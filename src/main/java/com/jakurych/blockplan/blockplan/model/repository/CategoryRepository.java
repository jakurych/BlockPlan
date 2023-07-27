package com.jakurych.blockplan.blockplan.model.repository;

import com.jakurych.blockplan.blockplan.model.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByName(String name);

}
