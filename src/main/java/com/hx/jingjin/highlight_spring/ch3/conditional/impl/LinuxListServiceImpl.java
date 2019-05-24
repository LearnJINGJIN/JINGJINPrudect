package com.hx.jingjin.highlight_spring.ch3.conditional.impl;

import com.hx.jingjin.highlight_spring.ch3.conditional.ListService;

/**
 * @ClassNameLinuxListServiceImpl Description TODO
 * @Author 14832
 * @Date 2019/4/23 16:37
 * @Version 1.0
 */
public class LinuxListServiceImpl implements ListService{
    public String showListCmd() {
        return "ls";
    }
}
