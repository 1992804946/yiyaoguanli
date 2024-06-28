package com.ljl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class customer {
    private int CustomerID;
    private int UserID;
    private String Name;
    private String ContactInfo;
    private boolean IsMember;
    private float MemberDiscount;
}
