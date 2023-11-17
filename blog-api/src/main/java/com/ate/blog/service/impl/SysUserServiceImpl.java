package com.ate.blog.service.impl;

import com.ate.blog.dao.mapper.SysUserMapper;
import com.ate.blog.dao.pojo.SysUser;
import com.ate.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("阿特");
        }
        return sysUser;
    }
}
