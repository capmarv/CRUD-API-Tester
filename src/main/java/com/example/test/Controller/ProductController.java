package com.example.test.Controller;

import com.example.test.Model.Product;
import com.example.test.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

        @Autowired
        ProductService service;

    @RequestMapping("/products")
        public List<Product> getproducts() {
            return service.getproducts();
    }
}
