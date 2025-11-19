package com.example.test.Controller;

import com.example.test.Model.Product;
import com.example.test.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/list")  // Base URL
public class ProductController {

    @Autowired
    private ProductService service;

    // Get all products
    @GetMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }

    // Get product by ID
    @GetMapping("/{pid}")
    public ResponseEntity<Product> getProductById(@PathVariable("pid") int pid) {
        Product product = service.getProductById(pid);
        return ResponseEntity.ok(product);
    }

    // Add a new product with validation
    @PostMapping
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
        Product saved = service.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // Update existing product
    @PutMapping("/{pid}")
    public ResponseEntity<Product> updateProduct(@PathVariable int pid, @Valid @RequestBody Product product) {
        Product updated = service.updateProduct(pid, product);
        return ResponseEntity.ok(updated);
    }

    // Delete a product
    @DeleteMapping("/{pid}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int pid) {
        service.deleteProduct(pid);
        return ResponseEntity.noContent().build();
    }
}
