package com.scaler.practice.productservicemay25aravinth.models;

import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity(name = "PRT_CATEGORY")
public class Category extends BaseModel{
    String name;
}
