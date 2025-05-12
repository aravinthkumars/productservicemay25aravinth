package com.scaler.practice.productservicemay25aravinth.models;

import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="PRT_CATEGORY")
public class Category extends BaseModel{
    String name;
}
