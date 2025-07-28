package com.zufang.lease.common.login;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Title: LoginUser
 * @Author 殇枫
 * @Package com.zufang.lease.common.login
 * @Date 2025/7/28
 * @description:
 */
@Data
@AllArgsConstructor
public class LoginUser {

    private Long userId;
    private String username;
}