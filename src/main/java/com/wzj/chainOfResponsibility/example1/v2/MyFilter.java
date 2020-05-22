package com.wzj.chainOfResponsibility.example1.v2;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:00
 * @Desc: 模拟实现过滤器
 */
public interface MyFilter {

    void doFilter(MyRequest myRequest, MyResponse myResponse, MyFilterChain myFilterChain);

}
