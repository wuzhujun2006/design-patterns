package com.wzj.state.example1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 20:19
 * @Desc: 上下文环境类
 */
public class Context {

    /**列出汽车所有状态
     * openningState-开门状态 closingState-关门状态
     * runningState-奔驰状态 stoppingState-停止状态
     */
    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();
    public static final RunningState runningState = new RunningState();
    public static final StoppingState stoppingState = new StoppingState();

    //定义汽车当前状态
    private CarState carState;

    public CarState getCarState() {
        return  carState;
    }

    public void setCarState(CarState carState) {
        this.carState = carState;
        //把当前的环境通知到各个实现类中
        this.carState.setContext(this);
    }

    //汽车开门
    public void open() {
        this.carState.open();
    }

    //汽车关门
    public void close(){
        this.carState.close();
    }

    //汽车飞奔
    public void run(){
        this.carState.run();
    }

    //汽车停止
    public void stop(){
        this.carState.stop();
    }

}
