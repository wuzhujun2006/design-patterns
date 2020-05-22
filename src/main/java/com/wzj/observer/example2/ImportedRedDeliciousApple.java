package com.wzj.observer.example2;

import java.util.Observable;

/**
 * @Author: wzj
 * @Date: 2019/10/3 17:02
 * @Desc: 进口蛇果类，继承jdk的Observable接口
 */
public class ImportedRedDeliciousApple extends Observable {


    public void peform() {
        System.out.println("通知: 进口蛇果已到...");
        //设置状态改变
        this.setChanged();
        this.notifyObservers();
    }

}
