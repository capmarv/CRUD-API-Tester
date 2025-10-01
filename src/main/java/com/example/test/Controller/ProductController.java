package com.example.test.Controller;

import com.example.test.Model.Product;
import com.example.test.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts() {
        return service.getproducts();
    }

    @GetMapping("/products/{pid}")
    public Product getproductById(@PathVariable("pid") int pid) {
        return service.getproductById(pid);
    }

    @PostMapping("/products")
    public Product addproduct(@RequestBody Product product) {
        return service.addproduct(product);
    }

    @PutMapping("/product/update")
    public Product updateproduct(@RequestBody Product product) {
        return service.updateproduct(product);
    }

    @DeleteMapping("/product/{pid}")
    public void deleteproduct(@PathVariable("pid") int pid) {
         service.deleteproduct(pid);
    }
}
