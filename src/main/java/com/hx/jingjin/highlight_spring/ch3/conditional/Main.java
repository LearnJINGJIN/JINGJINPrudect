package com.hx.jingjin.highlight_spring.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassNameMain Description TODO
 * @Author 14832
 * @Date 2019/4/23 16:39
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd());
    }
}
