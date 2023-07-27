package com.jakurych.blockplan.blockplan.service;

import com.jakurych.blockplan.blockplan.model.domain.Category;
import com.jakurych.blockplan.blockplan.model.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Category createOrUpdate(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    public Category findById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }
}
