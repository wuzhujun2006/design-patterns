package com.wzj.state.example2.v1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 23:12
 * @Desc: 女孩开心状态
 */
public class GirlHappyState extends GirlState {


    @Override
    public void smile() {
        System.out.println("女孩开心地微笑！！！");
    }

    @Override
    public void cry() {
        //do nothing
    }
}
