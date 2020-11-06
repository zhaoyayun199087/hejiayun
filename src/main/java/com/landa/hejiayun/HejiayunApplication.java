package com.landa.hejiayun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mashibing.controller"})
public class HejiayunApplication {

    public static void main(String[] args) {
        System.out.println("start application");
        SpringApplication.run(HejiayunApplication.class, args);
    }

}


