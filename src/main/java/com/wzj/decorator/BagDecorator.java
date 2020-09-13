package com.wzj.decorator;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:23
 * @Desc: 装饰器类
 */
public class BagDecorator implements Bag {
    private Bag bag;  //维持一个对抽象构件对象的引用

    public BagDecorator(Bag bag)  //注入一个抽象构件类型的对象
    {
        this.bag = bag;
    }

    public void pack() {
        bag.pack();
    }
}
