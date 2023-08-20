package com.jpa.springdatajpa.service;

import com.jpa.springdatajpa.entity.Product;
import com.jpa.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> productDetails(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> createProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> details() {
        return productRepository.findAll();
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public void deleteProduct(Long id) {
        Product productDetails = productDetails(id)
                .orElseThrow(() -> new RuntimeException
                        ("Product not exist with id : " + id));
        productRepository.delete(productDetails);
    }

    public void delete() {
        productRepository.deleteAll();
    }

    public Long productCount() {
        return productRepository.count();
    }

    public boolean productExists(Long id) {
        return productRepository.existsById(id);
    }
}
