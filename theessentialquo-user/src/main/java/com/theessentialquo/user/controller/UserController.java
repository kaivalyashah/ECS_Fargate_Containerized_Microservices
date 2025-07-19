package com.theessentialquo.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Simple REST controller to return a list of products.
 */
@RestController
public class UserController {

    @GetMapping("/api/users")
    public List<String> getProducts() {
        return List.of("Kaivalya", "Kaivalya1", "Kaivalya2");
    }
}
