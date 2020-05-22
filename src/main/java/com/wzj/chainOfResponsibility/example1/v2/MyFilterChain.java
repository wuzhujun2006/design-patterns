package com.wzj.chainOfResponsibility.example1.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:36
 * @Desc: 在MyFilterChain中处理加入位置的记录index
 */
public class MyFilterChain implements MyFilter {

    List<MyFilter> list = new ArrayList<MyFilter>();

    int index = 0;

    public MyFilterChain add(MyFilter myFilter) {
        list.add(myFilter);
        return this;
    }

    public void doFilter(MyRequest myRequest, MyResponse myResponse, MyFilterChain myFilterChain) {
        if(index == list.size())
            return;
        MyFilter myFilter = list.get(index);
        index ++;
        myFilter.doFilter(myRequest, myResponse, myFilterChain);
    }
}
