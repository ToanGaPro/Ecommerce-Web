package com.ecommerce.library.service;

import com.ecommerce.library.dto.ProductDTO;
import com.ecommerce.library.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAll();
    Product save(MultipartFile imageProduct, ProductDTO productDTO);
    Product update(MultipartFile imageProduct, ProductDTO productDto);

    void enableById(Long id);

    ProductDTO getById(Long id);

    void deleteById(Long id);

    Page<ProductDTO> searchProducts(int pageNo, String keyword);

    Page<ProductDTO> pageProducts(int pageNo);
    /*Customer*/
    List<Product> getAllProducts();

    List<Product> listViewProducts();

    Product getProductById(Long id);

    List<Product> getRelatedProducts(Long categoryId);

    List<Product> getProductsInCategory(Long categoryId);

    List<Product> filterHighPrice();

    List<Product> filterLowPrice();
}
