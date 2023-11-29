package com.ate.blog.service;

import com.ate.blog.dao.pojo.SysUser;
import com.ate.blog.vo.Result;
import com.ate.blog.vo.params.LoginParam;

public interface LoginService {
    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    /**
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);
}
