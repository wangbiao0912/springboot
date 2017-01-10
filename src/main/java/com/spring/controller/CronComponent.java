package com.spring.controller;

import com.spring.util.PublicUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * Created by zhaogj on 17/11/2016.
 * 定时任务
 */
@EnableScheduling
@Component
@Slf4j
public class CronComponent {

    //每10分钟执行一次
    public void doSomething() {
        //jvm内存的使用情况打印
        System.out.println(PublicUtil.getMemoryStatus()+"");;
    }

}
