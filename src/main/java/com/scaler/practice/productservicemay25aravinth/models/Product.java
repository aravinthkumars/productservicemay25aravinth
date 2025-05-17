package com.scaler.practice.productservicemay25aravinth.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity(name = "PRT_PRODUCT")
public class Product extends BaseModel {
    private String title;
    private double price;
    private String description;
    @ManyToOne//(cascade = CascadeType.ALL)
    private Category category;
    private String image;
//    @OneToOne
//    private Rating rating;
}
