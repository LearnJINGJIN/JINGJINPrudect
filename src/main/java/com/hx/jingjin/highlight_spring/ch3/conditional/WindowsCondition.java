package com.hx.jingjin.highlight_spring.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassNameWindowsCondition Description TODO
 * @Author 14832
 * @Date 2019/4/23 16:26
 * @Version 1.0
 */
public class WindowsCondition implements Condition{

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
