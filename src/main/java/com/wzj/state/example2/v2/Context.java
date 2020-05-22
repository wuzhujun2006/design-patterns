package com.wzj.state.example2.v2;

/**
 * @Author: wzj
 * @Date: 2019/11/3 23:10
 * @Desc: 上下文环境类
 */
public class Context {

    /**列出女孩所有状态
     * happyState-开心状态 sadState-伤心状态 talktiveState-聊天状态
     */
    public static final GirlHappyState happyState = new GirlHappyState();
    public static final GirlSadState sadState = new GirlSadState();
    public static final GirlTalktiveState talktiveState = new GirlTalktiveState();

    //定义女孩当前状态
    private GirlState girlState;

    public GirlState getGirlState() {
        return girlState;
    }

    public void setGirlState(GirlState girlState) {
        this.girlState = girlState;
        //把当前的环境通知到各个实现类中
        this.girlState.setContext(this);
    }

    //女孩微笑
    public void smile() {
        this.girlState.smile();
    }

    //女孩痛哭
    public void cry() {
        this.girlState.cry();
    }

    //女孩聊天
    public void talk() {
        this.girlState.talk();
    }
}
