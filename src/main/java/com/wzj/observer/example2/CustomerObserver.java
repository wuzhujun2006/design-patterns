package com.wzj.observer.example2;


import java.util.Observable;
import java.util.Observer;

/**
 * @Author: wzj
 * @Date: 2019/10/3 17:09
 * @Desc: 预定客户类,继承观察者接口
 */
public class CustomerObserver implements Observer {

    private String name;

    public CustomerObserver(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "已收到通知, 将立马过来购买！");
    }
}
