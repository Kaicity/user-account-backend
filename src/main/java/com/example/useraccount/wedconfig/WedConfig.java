package com.example.useraccount.wedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WedConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Đặt URL pattern của API của bạn ở đây
                .allowedOrigins("http://user-account-login.s3-website-ap-southeast-2.amazonaws.com")
//                .allowedOrigins("http://localhost:2000")
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Cho phép các phương thức HTTP
                .allowedHeaders("*"); // Cho phép tất cả các header
    }
}
