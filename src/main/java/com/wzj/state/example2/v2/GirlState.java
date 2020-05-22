package com.wzj.state.example2.v2;


/**
 * @Author: wzj
 * @Date: 2019/11/3 23:00
 * @Desc: 女孩状态类
 */
public abstract class GirlState {

    //环境角色，封装状态变化引起的行为变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //女孩微笑
    public abstract void smile();

    //女孩痛哭
    public abstract void cry();

    //女孩聊天
    public abstract void talk();

}
