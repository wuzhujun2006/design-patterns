package com.wzj.state.example2.v2;

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
        // do nothing
    }

    @Override
    public void talk() {
        //设置女孩开心状态-->聊天状态
        super.context.setGirlState(Context.talktiveState);
        //聊天动作委托TalktiveState类的talk()方法执行
        super.context.getGirlState().talk();
    }
}
