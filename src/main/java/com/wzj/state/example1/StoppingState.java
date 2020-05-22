package com.wzj.state.example1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 20:23
 * @Desc: 汽车停止状态类
 */
public class StoppingState extends CarState {

    //打开汽车门
    public void open() {
        super.context.setCarState(Context.openningState);
        super.context.getCarState().open();
    }

    //关闭汽车门
    public void close() {
        //do nothing
    }

    //汽车在飞奔
    public void run() {
        super.context.setCarState(Context.runningState);
        super.context.getCarState().run();
    }

    //汽车停止
    public void stop() {
        System.out.println("汽车停止状态...");
    }
}
