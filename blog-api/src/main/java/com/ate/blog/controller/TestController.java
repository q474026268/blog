package com.ate.blog.controller;

import com.ate.blog.dao.pojo.SysUser;
import com.ate.blog.utils.UserThreadLocal;
import com.ate.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test() {
        SysUser sysUser = UserThreadLocal.get();
        System.out.println("------------------" + sysUser);
        return Result.success(null);
    }
}