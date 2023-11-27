package com.ate.blog.service;

import com.ate.blog.dao.pojo.SysUser;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);
}
