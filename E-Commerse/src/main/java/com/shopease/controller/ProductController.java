package com.shopease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopease.entity.Product;
import com.shopease.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepo;

    @GetMapping
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return productRepo.save(product);
    }
}
