package com.ate.blog.controller;

import com.ate.blog.service.LoginService;
import com.ate.blog.vo.Result;
import com.ate.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping
    public Result login(@RequestBody LoginParam loginParam) {
        // 登录 验证用户 访问用户表
        return loginService.login(loginParam);
    }
}
