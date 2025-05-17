package com.scaler.practice.productservicemay25aravinth.repositories;

import com.scaler.practice.productservicemay25aravinth.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
