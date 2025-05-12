package com.scaler.practice.productservicemay25aravinth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scaler.practice.productservicemay25aravinth.models.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    public Product getSingleProduct(Long productId){
        Product product = new Product();
        return product;
    }
}
