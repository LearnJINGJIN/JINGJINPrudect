package com.hx.jingjin.highlight_spring.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassNameLinuxCondition Description linux判断条件
 * @Author 14832
 * @Date 2019/4/23 16:32
 * @Version 1.0
 */
public class LinuxCondition implements Condition{
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().getProperty("os.name").contains("Linux");
    }
}
