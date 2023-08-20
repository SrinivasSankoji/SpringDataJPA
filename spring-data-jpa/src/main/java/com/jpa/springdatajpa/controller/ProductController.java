package com.jpa.springdatajpa.controller;

import com.jpa.springdatajpa.entity.Product;
import com.jpa.springdatajpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "*")
@RestController
@RequestMapping ("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // create user rest API
    @PostMapping ("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.OK);
    }

    @PutMapping ("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id,
                                                 @RequestBody Product product) {
        Product productDetails = productService.productDetails(id)
                .orElseThrow(() -> new RuntimeException
                        ("User not exist with id : " + id));
        productDetails.setSku(product.getSku());
        productDetails.setName(product.getName());
        productDetails.setPrice(product.getPrice());
        productDetails.setImageURL(product.getImageURL());
        return new ResponseEntity<>(productService.createProduct(productDetails), HttpStatus.OK);
    }

    @GetMapping ("/details/{id}")
    public ResponseEntity<Product> productDetails(@PathVariable Long id) {
        Product productDetails = productService.productDetails(id)
                .orElseThrow(() -> new RuntimeException
                        ("Product not exist with id : " + id));
        return new ResponseEntity<>(productDetails, HttpStatus.OK);
    }

    @PostMapping ("/createProducts")
    public ResponseEntity<List<Product>> createProducts(@RequestBody List<Product> products) {
        return new ResponseEntity<>(productService.createProducts(products), HttpStatus.OK);
    }

    @GetMapping ("/details")
    public ResponseEntity<List<Product>> details() {
        List<Product> productDetails = productService.details();
        return new ResponseEntity<>(productDetails, HttpStatus.OK);
    }

    @GetMapping ("/delete/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping ("/deleteProduct/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping ("/delete")
    public ResponseEntity<String> delete() {
        productService.delete();
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping ("/count")
    public ResponseEntity<Long> count() {
        Long count = productService.productCount();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping ("/exists/{id}")
    public ResponseEntity<Boolean> count(@PathVariable Long id) {
        boolean result = productService.productExists(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
