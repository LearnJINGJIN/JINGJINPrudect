package com.hx.jingjin.highlight_spring.ch3.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassNameAsyncTaskServic3e Description TODO
 * @Author 14832
 * @Date 2019/4/23 15:41
 * @Version 1.0
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+(i+1));
    }
}
