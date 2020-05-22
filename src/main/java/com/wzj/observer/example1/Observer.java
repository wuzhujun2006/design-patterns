package com.wzj.observer.example1;

/**
 * @Author: wzj
 * @Date: 2019/10/3 14:53
 * @Desc: 观察者接口类
 */
public interface Observer {
    //收到通知后观察者更新
    void update();
}
