package com.hx.jingjin.highlight_spring.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassNameMain Description TODO
 * @Author 14832
 * @Date 2019/4/23 14:45
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService=context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }

}
