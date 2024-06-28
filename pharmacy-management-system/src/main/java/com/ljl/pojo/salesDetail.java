package com.ljl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class salesDetail {
    private int detailId;
    private Integer invoiceId; // 假设这里使用Integer来允许null值
    private Integer medicineId; // 假设这里使用Integer来允许null值
    private int quantitySold;
    private float sellingPrice;
}
