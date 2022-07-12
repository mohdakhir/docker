package com.example.dcokerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/get")
    public String getString()
    {
        return "hello docker";
    }
}
