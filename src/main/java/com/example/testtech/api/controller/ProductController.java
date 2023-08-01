package com.example.testtech.api.controller;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testtech.api.model.Order;
import com.example.testtech.api.model.Product;
import com.example.testtech.service.ProductService;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product")
    public ResponseEntity<Object> getProduct(@RequestParam Integer id) {
        Optional<Product> product = productService.getProduct(id);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            String errorMessage = "Product with Id " + id + " does not exist";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    
}
