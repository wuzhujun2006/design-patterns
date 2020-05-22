package com.wzj.state.example1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 20:23
 * @Desc: 汽车飞奔状态类
 */
public class RunningState extends CarState {

    //打开奔跑时不开门
    public void open() {
       //do nothing
    }

    //奔跑时肯定是关门的
    public void close() {
        //do nothing
    }

    //汽车在飞奔
    public void run() {
        System.out.println("汽车在飞奔...");
    }

    //汽车可以停下来
    public void stop() {
        //修改汽车为停止状态
        super.context.setCarState(Context.stoppingState);
        //停止动作委托为StoppingState类来执行
        super.context.getCarState().stop();
    }
}
