package com.example.test.Service;

import com.example.test.Model.Product;
import com.example.test.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getproducts() {
        return repo.findAll();
    }

    public Product getproductById(int pid) {
        return repo.findById(pid).orElse(new Product());
    }

    public Product addproduct(Product product) {
        return repo.save(product); // return saved entity
    }

    public Product updateproduct(Product product) {
        return repo.save(product); // return updated entity
    }

    public void deleteproduct(int pid) {
        repo.deleteById(pid); // no return needed
    }
}
