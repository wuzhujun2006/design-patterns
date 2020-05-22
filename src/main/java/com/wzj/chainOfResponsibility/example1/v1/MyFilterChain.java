package com.wzj.chainOfResponsibility.example1.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:36
 * @Desc:
 */
public class MyFilterChain implements MyFilter {

    List<MyFilter> list = new ArrayList<MyFilter>();

    public MyFilterChain add(MyFilter myFilter) {
        list.add(myFilter);
        return this;
    }

    public void doFilter(MyRequest myRequest, MyResponse myResponse) {
        for(MyFilter f : list ){
            f.doFilter(myRequest, myResponse);
        }
    }
}
