package com.scaler.practice.productservicemay25aravinth.controllers;

import java.util.List;
import java.util.ArrayList;

import com.scaler.practice.productservicemay25aravinth.exceptions.CatgeoryNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.scaler.practice.productservicemay25aravinth.models.Product;
import com.scaler.practice.productservicemay25aravinth.services.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

    //localhost:8080/products/10
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId){
        Product product = null;
        try{
            product = productService.getSingleProduct(productId);
        } catch (Exception e) {
            e.printStackTrace();
        }
         return product;
    }

    //localhost:8080/products/
    @GetMapping("/")
    public List<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }

    //localhost:8080/products/
    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){
        Product response = null;

        try {
            response = this.productService.createProduct(product);
        } catch (CatgeoryNotFoundException e) {
            e.printStackTrace();
        }

        return response;
    }

    /*
    * {
    *   "title" : "iPhone 16 pro"
    *   "desciption" : "best iphone"
    *   "price" : "75,000"
    *    .....
    *   }
    *
    * */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long productId){
        ResponseEntity<Void> response = new ResponseEntity<>(HttpStatus.OK);
        this.productService.deleteProduct(productId);
        return response;
    }

    //Update APIs
    // updateProduct() -> PATCH
    // replaceProduct() -> PUT


}
