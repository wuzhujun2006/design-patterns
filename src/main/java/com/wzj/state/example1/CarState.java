package com.wzj.state.example1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 20:10
 * @Desc: 汽车状态抽象类
 */
public abstract class CarState {
    //环境角色，封装状态变化引起的行为变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //汽车开门动作
    public abstract void open();

    //汽车关门动作
    public abstract void close();

    //汽车飞奔动作
    public abstract void run();

    //汽车停止动作
    public abstract void stop();

}
