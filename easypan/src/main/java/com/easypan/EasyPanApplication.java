package com.easypan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhl
 * @date 2024/09/23 21:21
 **/

@SpringBootApplication(scanBasePackages = {"com.easypan"})
@EnableAsync
@EnableTransactionManagement
@EnableScheduling
@MapperScan(basePackages = "com.easypan.mappers")
public class EasyPanApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyPanApplication.class);
    }
}
