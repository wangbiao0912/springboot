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
        //禁用改代码就重启
        /**
         * 如果不想使用重启特性，你可以通过 spring.devtools.restart.enabled 属性
         来禁用它，通常情况下可以在 application.properties 文件中设置（ 依旧会初
         始化重启类加载器，但它不会监控文件变化） 。
         如果需要彻底禁用重启支持，比如，不能跟某个特殊库一块工作，
         */
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DemoApplication.class, args);
    }
}
