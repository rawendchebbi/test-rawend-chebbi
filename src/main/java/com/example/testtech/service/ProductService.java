package com.example.testtech.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.testtech.api.model.Product;

@Service
public class ProductService {

    private List<Product> productList;

    public ProductService(){
        productList = new ArrayList<>();

        Product product1 = new Product(1, "purse", 200);
        Product product2 = new Product(2, "tshirt", 15);
        Product product3 = new Product(3, "shoes", 90);
        Product product4 = new Product(4, "jeans", 25);
        Product product5 = new Product(5, "dress", 70);

        productList.addAll(Arrays.asList(product1,product2,product3,product4,product5));

    }

     public Optional<Product> getProduct(Integer id) {
        Optional<Product> optional = Optional.empty();
        for (Product product: productList) {
            if(id == product.getId()){
                optional = Optional.of(product);
                return optional;
            }
        }
        return optional;
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Optional<Product> getProductByName(String name) {
        return productList.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    
}

