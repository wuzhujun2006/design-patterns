package com.wzj.observer.example1;

/**
 * @Author: wzj
 * @Date: 2019/10/3 15:19
 * @Desc: 进口蛇果类
 */
public class ImportedRedDeliciousApple extends FruitObservable {

    @Override
    public void notifyObservers() {
        System.out.println("通知: 进口蛇果已到...");
        for(Observer o : obs) {
            //通知每位预定顾客
            o.update();
        }
    }
}
