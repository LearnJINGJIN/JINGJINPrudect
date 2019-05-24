package com.hx.jingjin.common.datasource.annotation;

import java.lang.annotation.*;
/* *
 * @Author 用于方法和类上面标注数据源
 * @Description //TODO
 * @Date 10:18 2019/4/19
 * @Param
 * @return
 **/
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Datasource {
    String name() default "";
}
