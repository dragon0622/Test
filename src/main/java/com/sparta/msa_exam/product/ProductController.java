package com.sparta.msa_exam.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping ("/products")
    public String getProducts(){
        return "";
    }

    @PostMapping ("/products")
    public String addProducts(){
        return "port : "+serverPort;
    }


}
