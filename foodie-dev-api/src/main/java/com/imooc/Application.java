package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mabtis通用mapper地址
@MapperScan(basePackages = "com.imooc.mapper" )
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
