package com.wwg.util;

import javax.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    /**
     * FilterRegistrationBean 用来配置urlpattern 来确定哪些路径触发filter
     */
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(myFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("sessionFilter");
        registration.setOrder(1);
        return registration;
    }

    /**
     * 创建一个bean
     * 
     * @return
     */
    @Bean(name = "myFilter")
    public Filter myFilter() {
        return new MyFilter();
    }

}
