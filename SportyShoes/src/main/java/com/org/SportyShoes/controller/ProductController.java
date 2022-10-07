package com.org.SportyShoes.controller;

import com.org.SportyShoes.model.Product;
import com.org.SportyShoes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    Product newProduct(@RequestBody Product newProduct){
        return productRepository.save(newProduct);
    }
}
