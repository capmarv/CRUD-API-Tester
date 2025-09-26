package com.example.test.Service;

import com.example.test.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> Products =  Arrays.asList(new Product(101 , "maybelline" , 799) ,
            new Product(102 , "loreal" , 899) ,
            new Product(103 , "bobby brown" , 2899));
    public List<Product> getproducts() {
    return Products;
    }
}
