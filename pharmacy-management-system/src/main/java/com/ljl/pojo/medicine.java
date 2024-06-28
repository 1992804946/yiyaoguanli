package com.ljl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class medicine {
    private int id;
    private String name;
    private String manufacturer;
    private String category;
    private int stockQuantity;
    private java.util.Date expiryDate;
    private float purchasePrice;
    private float sellingPrice;
}
