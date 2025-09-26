package com.example.test.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "this is home";
    }

    @RequestMapping("/about")
    public String about() {
        return "we can do it!!";
    }
}
