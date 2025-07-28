package com.zufang.lease.common.login;

/**
 * @Title: LoginUserHolder
 * @Author 殇枫
 * @Package com.zufang.lease.common.login
 * @Date 2025/7/28
 * @description:
 */
public class LoginUserHolder {
    public static ThreadLocal<LoginUser> threadLocal = new ThreadLocal<>();

    public static void setLoginUser(LoginUser loginUser) {
        threadLocal.set(loginUser);
    }

    public static LoginUser getLoginUser() {
        return threadLocal.get();
    }

    public static void clear() {
        threadLocal.remove();
    }
}