package com.scaler.practice.productservicemay25aravinth.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "PRT_CATEGORY")
public class Category extends BaseModel{
    String categoryName;
}
