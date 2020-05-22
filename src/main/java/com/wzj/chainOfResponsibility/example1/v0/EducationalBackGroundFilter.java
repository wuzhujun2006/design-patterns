package com.wzj.chainOfResponsibility.example1.v0;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:33
 * @Desc: 教育背景过滤器
 */
public class EducationalBackGroundFilter implements MyFilter {
    public void doFilter(MyRequest myRequest, MyResponse myResponse) {
        myRequest.str = myRequest.str.replace("学历大专", "学历不高");
    }
}
