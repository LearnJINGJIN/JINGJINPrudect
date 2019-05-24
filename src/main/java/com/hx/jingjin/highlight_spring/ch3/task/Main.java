package com.hx.jingjin.highlight_spring.ch3.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassNameMain Description TODO
 * @Author 14832
 * @Date 2019/4/23 15:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
//        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
//        for (int i = 0; i <10 ; i++) {
//            asyncTaskService.executeAsyncTask(i);
//            asyncTaskService.executeAsyncTaskPlus(i);
//        }
//        context.close();
    }
}
