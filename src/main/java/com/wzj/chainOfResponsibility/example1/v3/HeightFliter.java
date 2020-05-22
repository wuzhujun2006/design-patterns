package com.wzj.chainOfResponsibility.example1.v3;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:20
 * @Desc: 身高过滤器
 */
public class HeightFliter implements MyFilter {

    public void doFilter(MyRequest myRequest, MyResponse myResponse, MyFilterChain myFilterChain) {
        myRequest.str = myRequest.str.replace("170", "个子有点矮");
        myFilterChain.doFilter(myRequest, myResponse);
        myResponse.str += "【妹子挑剔，需要过滤身高】";
    }
}
