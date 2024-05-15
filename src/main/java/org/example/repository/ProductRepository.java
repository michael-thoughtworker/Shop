package org.example.repository;

import jakarta.annotation.PostConstruct;
import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {
        // Add some sample products
        products.add(new Product(1L, "Laptop", "A high-performance laptop", 999.99));
        products.add(new Product(2L, "Smartphone", "A latest-gen smartphone", 799.99));
        products.add(new Product(3L, "Tablet", "A lightweight tablet", 499.99));
        // Add more products as needed
    }

    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    public List<Product> findByNameContaining(String name) {
        return products.stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}