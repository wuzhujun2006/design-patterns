package com.wzj.observer.example1;

/**
 * @Author: wzj
 * @Date: 2019/10/3 15:25
 * @Desc: 预定进口蛇果的客户类
 */
public class CustomerObserver implements Observer {

    //观察者姓名
    private String name;


    public CustomerObserver(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "已收到通知, 将立马过来购买！");
    }
}
