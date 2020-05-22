package com.wzj.state.example2.v1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 23:10
 * @Desc: 上下文环境类
 */
public class Context {

    /**列出女孩所有状态
     * happyState-开心状态 sadState-伤心状态
     */
    public static final GirlHappyState happyState = new GirlHappyState();
    public static final GirlSadState sadState = new GirlSadState();

    //定义女孩当前状态
    private GirlState girlState;

    public GirlState getGirlState() {
        return girlState;
    }

    public void setGirlState(GirlState girlState) {
        this.girlState = girlState;
    }

    //女孩微笑
    public void smile() {
        this.girlState.smile();
    }

    //女孩痛哭
    public void cry() {
        this.girlState.cry();
    }
}
