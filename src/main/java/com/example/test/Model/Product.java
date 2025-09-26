package com.example.test.Model;

import lombok.Data;

import org.springframework.stereotype.Component;

@Data

public class Product {

    private int Pid;
    private String name;
    private int price;

    public Product( int pid, String name, int price) {
        this.Pid = pid;
        this.name = name;
        this.price = price;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
