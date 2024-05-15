package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> searchProducts(String query) {
        if (query == null || query.isEmpty()) {
            return productRepository.findAll();
        } else {
            return productRepository.findByNameContaining(query);
        }
    }
}
