package com.breamer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * APP主程序入口
 * @author zhang.penghao
 * @date: 2018/7/11 11:36
 */
@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan("com.breamer.demo.druid")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
