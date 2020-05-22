package com.wzj.state.example2.v2;

/**
 * @Author: wzj
 * @Date: 2019/11/3 23:12
 * @Desc: 女孩伤心状态
 */
public class GirlSadState extends GirlState {
    @Override
    public void smile() {
        //do nothing
    }

    @Override
    public void cry() {
        System.out.println("女孩伤心地痛哭！！！");
    }

    @Override
    public void talk() {
        //do nothing
    }
}
