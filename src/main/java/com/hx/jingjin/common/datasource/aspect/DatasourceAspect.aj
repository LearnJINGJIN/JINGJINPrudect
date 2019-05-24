package com.hx.jingjin.common.datasource.aspect;

import com.hx.jingjin.common.datasource.annotation.Datasource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DatasourceAspect implements Ordered{
   protected Logger logger= LoggerFactory.getLogger(DatasourceAspect.class);
   @Pointcut("@annotation(com.hx.jingjin.common.datasource.annotation.Datasource)")
   public void datasourcePointcut(){
   }
   /* *
    * @Author jingjin
    * @Description //拦截目标方法，获取由@DataSource指定的数据源标识，设置到线程存储中以便切换数据源
    * @Date 15:33 2019/4/19
    * @Param [point]
    * @return void
    **/
   @Before("dataSourcePointCut()")
   public void intercept(JoinPoint point) throws Exception{
      Class<?> target=point.getTarget().getClass();
      MethodSignature signature=(MethodSignature)point.getSignature();
      for (Class<?> clazz:target.getInterfaces()) {
         resolveDataSource(clazz, signature.getMethod());
      }
       resolveDataSource(target, signature.getMethod());
   }
   //抽取目标对象方法注解和类型注解中的数据源标识
   private void resolveDataSource(Class<?> clazz, Method method){
       try {
           Class<?>[] types=method.getParameterTypes();
           //默认使用类型注解
           if (clazz.isAnnotationPresent(Datasource.class)){
               Datasource source=clazz.getAnnotation(Datasource.class);

           }
       }catch (Exception e){

       }
   }
   public int getOrder() {
      return 1;
   }
}
