package com.zufang.lease.web.admin.service;

import com.zufang.lease.web.admin.vo.login.CaptchaVo;
import com.zufang.lease.web.admin.vo.login.LoginVo;
import com.zufang.lease.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getLoginUserInfo(Long userId);
}
