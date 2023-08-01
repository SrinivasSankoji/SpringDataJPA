package com.jpa.springdatajpa.controller;

import com.jpa.springdatajpa.entity.Product;
import com.jpa.springdatajpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin (origins = "*")
@RestController
@RequestMapping ("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // create user rest API
    @PostMapping ("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.createProduct(product), HttpStatus.OK);
    }

    @PutMapping ("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id,
                                                 @RequestBody Product product) {
        Product productDetails = productService.getProduct(id)
                .orElseThrow(() -> new RuntimeException
                        ("User not exist with id : " + id));
        productDetails.setSku(product.getSku());
        productDetails.setName(product.getName());
        productDetails.setPrice(product.getPrice());
        productDetails.setImageURL(product.getImageURL());
        return new ResponseEntity<Product>(productService.createProduct(productDetails), HttpStatus.OK);
    }


}
