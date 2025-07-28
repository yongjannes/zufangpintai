package com.zufang.lease.common.utils;

import java.util.Random;

/**
 * @Title: VerifyCodeUtil
 * @Author 殇枫
 * @Package com.zufang.lease.common.utils
 * @Date 2025/7/28
 * @description:
 */
public class VerifyCodeUtil {
    public static String getVerifyCode(int length) {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }
}