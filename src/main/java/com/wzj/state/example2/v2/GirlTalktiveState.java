package com.wzj.state.example2.v2;

/**
 * @Author: wzj
 * @Date: 2019/11/4 18:22
 * @Desc: 女孩聊天状态
 */
public class GirlTalktiveState extends GirlState{
    @Override
    public void smile() {
        ////设置女孩聊天状态-->开心状态
        super.context.setGirlState(Context.happyState);
        //聊天动作委托HappyState类的simle()方法执行
        super.context.getGirlState().smile();

    }

    @Override
    public void cry() {
        //do nothing
    }

    @Override
    public void talk() {
        System.out.println("女孩聊天中");
    }

}
