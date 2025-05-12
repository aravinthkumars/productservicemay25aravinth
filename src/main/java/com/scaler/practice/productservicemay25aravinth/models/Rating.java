package com.scaler.practice.productservicemay25aravinth.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="PRT_RATING")
public class Rating extends BaseModel {
    double rate;
    int count;
}
