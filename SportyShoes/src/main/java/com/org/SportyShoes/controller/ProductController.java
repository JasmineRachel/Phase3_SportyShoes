package com.org.SportyShoes.controller;

import com.org.SportyShoes.model.Product;
import com.org.SportyShoes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // this returns the data, it does not return it on th view. Just creating a rest api here!
//@Controller //use this!
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path="/product")
    Product newProduct(Product newProduct){
        System.out.print(newProduct);
        return productRepository.save(newProduct);
    }

    @GetMapping("/all_products")
    List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
