package com.wzj.observer.example1;

import java.util.Vector;

/**
 * @Author: wzj
 * @Date: 2019/10/3 14:50
 * @Desc: 水果店被观察者类
 */
public abstract class FruitObservable {

    //线程安全的容器类
    protected Vector<Observer> obs = new Vector<>();

    //添加预定顾客
    public void addObserver(Observer o) {
        obs.addElement(o);
    }

    //删除固定顾客
    public void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    //通知已预定顾客
    public abstract void notifyObservers();

}
