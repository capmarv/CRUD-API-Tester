package com.example.test.Service;

import com.example.test.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> Products =  new ArrayList<> (Arrays.asList(
            new Product(101 , "maybelline" , 799) ,
            new Product(102 , "loreal" , 899) ,
            new Product(103 , "bobby brown" , 2899)
    ));


    public List<Product> getproducts() {
    return Products;
    }

    public Product getproductById(int pid) {
        return Products.stream().filter(product -> product.getPid() == pid).findFirst().get();
    }
    public Product addproduct(Product product) {
        Products.add(product);
        return product;
    }
    public Product updateproduct(Product product) {
        int index = 0;
        for (Product p : Products) {
            if (p.getPid() == product.getPid()) {
                product.setPid(p.getPid());
            }
        }
        return product;
    }
    public void deleteproduct(int pid) {
        int index = 0;
        for (Product p : Products) {
            if (p.getPid() == pid) {
                Products.remove(index);
            }
        }
    }
}
