package com.scaler.practice.productservicemay25aravinth.services;

import com.scaler.practice.productservicemay25aravinth.exceptions.CatgeoryNotFoundException;
import com.scaler.practice.productservicemay25aravinth.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product) throws CatgeoryNotFoundException;
    boolean deleteProduct(Long productId);
}
