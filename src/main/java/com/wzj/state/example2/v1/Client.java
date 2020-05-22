package com.wzj.state.example2.v1;

/**
 * @Author: wzj
 * @Date: 2019/11/4 17:52
 * @Desc: 客户端类
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setGirlState(new GirlSadState());
        context.smile();
        context.cry();
    }
}
