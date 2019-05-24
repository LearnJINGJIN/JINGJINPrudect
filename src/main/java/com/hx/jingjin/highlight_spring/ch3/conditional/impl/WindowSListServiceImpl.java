package com.hx.jingjin.highlight_spring.ch3.conditional.impl;

import com.hx.jingjin.highlight_spring.ch3.conditional.ListService;

/**
 * @ClassNameWindowSListServiceImpl Description TODO
 * @Author 14832
 * @Date 2019/4/23 16:36
 * @Version 1.0
 */
public class WindowSListServiceImpl implements ListService{
    public String showListCmd() {
        return "dir";
    }
}
