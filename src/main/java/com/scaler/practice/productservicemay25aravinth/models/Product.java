package com.scaler.practice.productservicemay25aravinth.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "PRT_PRODUCT")
public class Product extends BaseModel {
    String title;
    double price;
    String description;
    @ManyToOne(cascade = CascadeType.ALL)
    Category category;
    String image;
    @OneToOne
    Rating rating;
}
