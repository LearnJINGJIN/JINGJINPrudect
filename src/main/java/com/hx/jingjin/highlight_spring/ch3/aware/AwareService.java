package com.hx.jingjin.highlight_spring.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;


/**
 * @ClassNameAwareService Description TODO
 * @Author 14832
 * @Date 2019/4/23 14:11
 * @Version 1.0
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
    private String beanName;
    private ResourceLoader loader;
    public void setBeanName(String name) {
        this.beanName=name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader=resourceLoader;
    }
    public void outputResult(){
        System.out.println("bean的名称："+beanName);
        Resource resource=loader.getResource(ResourceLoader.CLASSPATH_URL_PREFIX+"com/hx/jingjin/highlight_spring/ch3/aware/test.txt");
        try {
           InputStream im= resource.getInputStream();
            System.out.println("resourceLoader加载的文件内容为："+ IOUtils.toString(im));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
