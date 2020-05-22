package com.wzj.state.example1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 20:23
 * @Desc: 汽车开门状态类
 */
public class OpenningState extends CarState {

    //打开汽车门
    public void open() {
        System.out.println("汽车门已开启...");
    }

    //关闭汽车门
    public void close() {
        //状态修改
        super.context.setCarState(Context.closingState);
        //动作委托为ClosingState来执行
        super.context.getCarState().close();
    }

    //门开着时汽车一般不奔跑
    public void run() {
        //do nothing
    }

    //门开着时汽车一般不是停止状态
    public void stop() {
        //do nothing

    }
}
