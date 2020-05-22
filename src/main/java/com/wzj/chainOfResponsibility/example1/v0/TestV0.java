package com.wzj.chainOfResponsibility.example1.v0;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:42
 * @Desc: 将过滤完的请求结果写在request的里面打印出来
 */
public class TestV0 {
    public static void main(String[] args) {
        MyRequest myRequest = new MyRequest();
        myRequest.str = "张三身高170，学历大专，跪求妹子给个机会认识!";
        System.out.println("request:" + myRequest.str);
        MyResponse myResponse = new MyResponse();
        MyFilterChain chain = new MyFilterChain();
        chain.add(new HeightFliter()).add(new EducationalBackGroundFilter());
        chain.doFilter(myRequest, myResponse);
        myResponse.str = myRequest.str;
        System.out.println("response:" + myResponse.str);
    }

}
