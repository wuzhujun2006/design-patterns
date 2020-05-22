package com.wzj.chainOfResponsibility.example1.v2;

/**
 * @Author: wzj
 * @Date: 2019/9/7 20:42
 * @Desc: 过滤请求时顺序，响应请求时逆序,在MyFilterChain中处理加入位置的记录，
 * 同时在MyFilter中加入第三个参数MyFilterChain，让链条递归实现倒序
 */
public class TestV2 {
    public static void main(String[] args) {
        MyRequest myRequest = new MyRequest();
        myRequest.str = "张三身高170，学历大专，跪求妹子给个机会认识";
        System.out.println("request:" + myRequest.str);
        MyResponse myResponse = new MyResponse();
        myResponse.str = "";
        MyFilterChain chain = new MyFilterChain();
        chain.add(new HeightFliter()).add(new EducationalBackGroundFilter());
        chain.doFilter(myRequest, myResponse, chain);
        System.out.println("response:" + myResponse.str);
    }

}
