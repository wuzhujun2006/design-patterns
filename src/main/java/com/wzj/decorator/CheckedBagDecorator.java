package com.wzj.decorator;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:32
 * @Desc: 防伪装饰器
 */
public class CheckedBagDecorator extends BagDecorator {
    public CheckedBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();
        checked();  //打印防伪标识
    }

    //增加防伪标识
    public void checked() {
        System.out.println("===============");
        System.out.println("打印上防伪标识");
    }
}
