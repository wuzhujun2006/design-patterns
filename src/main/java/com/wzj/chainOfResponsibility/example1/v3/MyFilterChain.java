package com.wzj.chainOfResponsibility.example1.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:36
 * @Desc: 过滤器完全模式，去掉实现接口，并将doFilter方法中的chain
 */
public class MyFilterChain{

    List<MyFilter> list = new ArrayList<MyFilter>();

    int index = 0;

    public MyFilterChain add(MyFilter myFilter) {
        list.add(myFilter);
        return this;
    }

    public void doFilter(MyRequest myRequest, MyResponse myResponse) {
        if(index == list.size())
            return;
        MyFilter myFilter = list.get(index);
        index ++;
        myFilter.doFilter(myRequest, myResponse, this);
    }
}
