package com.ecommerce.library.dto;

import com.ecommerce.library.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private int currentQuantity;
    private float cost;
    private float sale;
    private String image;
    private Category category;
    private boolean deleted;
    private boolean activated;
}
