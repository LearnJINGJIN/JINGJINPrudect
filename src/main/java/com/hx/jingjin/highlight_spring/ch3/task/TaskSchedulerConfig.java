package com.hx.jingjin.highlight_spring.ch3.task;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassNameTaskSchedulerConfig Description TODO
 * @Author 14832
 * @Date 2019/4/23 16:09
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.hx.jingjin.highlight_spring.ch3.task")
@EnableScheduling
public class TaskSchedulerConfig {
}
