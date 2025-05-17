package com.scaler.practice.productservicemay25aravinth.dtos;

import com.scaler.practice.productservicemay25aravinth.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDTO {
    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}
