package com.ecommerce.library.repository;

import com.ecommerce.library.dto.CategoryDTO;
import com.ecommerce.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("select c from Category c where c.is_activated= true and c.is_deleted=false ")
    List<Category> findAllByActivated();

    /*Customer*/
    @Query("select new com.ecommerce.library.dto.CategoryDTO(c.id, c.name, count(p.category.id)) from Category c inner join Product p on p.category.id = c.id " +
            " where c.is_activated = true and c.is_deleted = false group by c.id")
    List<CategoryDTO> getCategoryAndProduct();
}
