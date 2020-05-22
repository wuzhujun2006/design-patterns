package com.wzj.state.example1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 20:23
 * @Desc: 汽车关门状态类
 */
public class ClosingState extends CarState {

    //打开汽车门
    public void open() {
        //修改汽车为开门状态
        super.context.setCarState(Context.openningState);
        //动作委托为OpenningState类来执行
        super.context.getCarState().open();
    }

    //关闭汽车门
    public void close() {
        System.out.println("汽车门已关闭...");
    }

    //汽车在飞奔
    public void run() {
        //修改汽车为飞奔状态
        super.context.setCarState(Context.runningState);
        //动作委托为RunningState类来执行
        super.context.getCarState().run();

    }

    //汽车在停止
    public void stop() {
        //设置汽车状态为停止状态
        super.context.setCarState(Context.stoppingState);
        //动作委托为StoppingState类来执行
        super.context.getCarState().stop();

    }
}
