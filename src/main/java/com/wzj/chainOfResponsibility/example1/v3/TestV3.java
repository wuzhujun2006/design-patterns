package com.wzj.chainOfResponsibility.example1.v3;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:42
 * @Desc: 过滤器完全模式
 */
public class TestV3 {
    public static void main(String[] args) {
        MyRequest myRequest = new MyRequest();
        myRequest.str = "张三身高170，学历大专，跪求妹子给个机会认识";
        System.out.println("request:" + myRequest.str);
        MyResponse myResponse = new MyResponse();
        myResponse.str = "";
        MyFilterChain chain = new MyFilterChain();
        chain.add(new HeightFliter()).add(new EducationalBackGroundFilter());
        chain.doFilter(myRequest, myResponse);
        System.out.println("response:" + myResponse.str);
    }

}
