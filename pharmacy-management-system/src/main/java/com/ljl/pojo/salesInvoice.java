package com.ljl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class salesInvoice {
    private int invoiceId;
    private java.util.Date saleDate;
    private Integer customerId; // 假设这里使用Integer来允许null值
    private Integer salespersonId; // 假设这里使用Integer来允许null值
    private float totalAmount;
}
