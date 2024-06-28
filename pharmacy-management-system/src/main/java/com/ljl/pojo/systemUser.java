package com.ljl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class systemUser {
    private int userId;
    private String username;
    private String password; // 注意：密码在真实应用中应该是加密存储和处理的
    private String role;
}
