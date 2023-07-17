package com.ecommerce.library.service;

import com.ecommerce.library.dto.CategoryDTO;
import com.ecommerce.library.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enableById(Long id);
    /*Customer*/
    List<CategoryDTO> getCategoryAndProduct();

    List<Category> findAllByActivated();
}
