package com.ate.blog.config;


import com.ate.blog.handler.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    // 添加CORS（跨源资源共享）的配置
    public void addCorsMappings(CorsRegistry registry) {
        // 配置跨域请求
        registry.addMapping("/**")  // 指定可以被跨域请求的路径模式，这里的“/**”表示对所有路径允许跨域请求
                .allowedOrigins("http://localhost:8080"); // 指定允许跨域请求的原始域请求
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截test接口,后续实际遇到需要拦截的接口时，再配置为真正的拦截接口
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/test")
                .addPathPatterns("/comments/create/change")
                .excludePathPatterns("/login").excludePathPatterns("/register");

    }
}
