package com.wwg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.wwg.dao")
@ImportResource("classpath:wwg*.xml")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
