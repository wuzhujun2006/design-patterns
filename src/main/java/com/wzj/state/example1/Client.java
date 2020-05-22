package com.wzj.state.example1;

/**
 * @Author: wzj
 * @Date: 2019/11/3 21:06
 * @Desc:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCarState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
