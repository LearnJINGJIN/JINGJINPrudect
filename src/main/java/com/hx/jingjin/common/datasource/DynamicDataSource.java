package com.hx.jingjin.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassNameDynamicDataSource Description 动态数据源
 * @Author 14832
 * @Date 2019/4/22 9:49
 * @Version 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource{
    private static final ThreadLocal<String> contextHolder=new ThreadLocal<String>();
    public DynamicDataSource(DataSource dafaultTargetDataSource, Map<String,DataSource> targetDataSource){
        super.setDefaultTargetDataSource(dafaultTargetDataSource);
        super.setTargetDataSources(new HashMap<Object, Object>(targetDataSource));
        super.afterPropertiesSet();
    }
    @Override
    protected Object determineCurrentLookupKey() {
        return getDataSource();
    }

    public static void setDataSource(String dataSource) {
        contextHolder.set(dataSource);
    }

    public static String getDataSource() {
        return contextHolder.get();
    }

    public static void clearDataSource() {
        contextHolder.remove();
    }
}
