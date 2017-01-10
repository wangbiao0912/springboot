package com.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wangbiao on 17-1-6.
 */

@SpringBootApplication
//@EnableScheduling
@Slf4j    
//@RestController
//@EnableAutoConfiguration
public class DemoApplication {
    public static void main(String[] args) {
        log.info("DemoApplication is starting...");
        SpringApplication.run(DemoApplication.class, args);
    }
}
