package com.woniuxy.sysspringmvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.woniuxy.sysspringmvc.mapper")
public class SysSpringmvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysSpringmvcApplication.class, args);
    }

}
