package com.wwg.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 跨域访问设置
 * 如果要用到Cookie，那么需要在前端设置.withCredentials=true
 * .addCorsMappings()中的参数代表支持跨域的url，.allowedOrigins()中的参数代表可以访问该接口的域名，设置为”*”可支持所有域。
 * @author wwg
 *
 */
@Configuration  
public class CorsConfig extends WebMvcConfigurerAdapter {  

    @Override  
    public void addCorsMappings(CorsRegistry registry) {  
        registry.addMapping("/**")  
                .allowedOrigins("*")  
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT")  
                .maxAge(3600);  
    }  

}  