package com.example.test.Service;

import com.example.test.Model.Product;
import com.example.test.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    // Get all products
    public List<Product> getProducts() {
        return repo.findAll();
    }

    // Get product by ID
    public Product getProductById(int pid) {
        return repo.findById(pid).orElse(null); // return null if not found
    }

    // Add new product
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    // Update existing product
    public Product updateProduct(int pid, Product product) {
        Optional<Product> existing = repo.findById(pid);
        if (existing.isPresent()) {
            Product p = existing.get();
            p.setName(product.getName());
            p.setPrice(product.getPrice());
            return repo.save(p);
        } else {
            return null; // or throw an exception
        }
    }

    public void deleteProduct(int pid) {
        repo.deleteById(pid);
    }
}

