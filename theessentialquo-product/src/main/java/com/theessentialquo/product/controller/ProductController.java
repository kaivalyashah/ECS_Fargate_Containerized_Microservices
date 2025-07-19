package com.theessentialquo.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Simple REST controller to return a list of products.
 */
@RestController
public class ProductController {

    @GetMapping("/api/products")
    public List<String> getProducts() {
        return List.of("Notebook", "Pen", "Book");
    }
}
