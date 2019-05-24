package com.hx.jingjin.highlight_spring.ch3.conditional;

import com.hx.jingjin.highlight_spring.ch3.conditional.impl.LinuxListServiceImpl;
import com.hx.jingjin.highlight_spring.ch3.conditional.impl.WindowSListServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassNameConditionConfig Description TODO
 * @Author 14832
 * @Date 2019/4/23 16:38
 * @Version 1.0
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windListService(){
        return new WindowSListServiceImpl();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListServiceImpl();
    }
}
