package com.hx.jingjin.highlight_spring.ch3.task;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassNameScheduledTaskService Description 计划任务执行类
 * @Author 14832
 * @Date 2019/4/23 15:58
 * @Version 1.0
 */
public class ScheduledTaskService {
    private static  final SimpleDateFormat dataFormat=new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)//通过声明改方法是计划任务 固定时间执行5秒/次
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次"+ dataFormat.format(new Date()));
    }
    @Scheduled(cron = "0 15 16 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间："+dataFormat.format(new Date()));
    }
}
