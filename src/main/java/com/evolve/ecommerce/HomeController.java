package com.evolve.ecommerce;

import com.evolve.ecommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to EVOLVE - Your E-Commerce Hub</h1>";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
            new Product(1, "Laptop", 50000),
            new Product(2, "Mobile", 15000),
            new Product(3, "Headphones", 2500)
        );
    }
}