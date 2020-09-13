package com.wzj.decorator;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:34
 * @Desc: 加急装饰器
 */
public class SpeedBagDecorator extends BagDecorator {

    public SpeedBagDecorator(Bag bag) {
        super(bag);
    }

    public void pack() {
        super.pack();  //调用原有业务方法
        speedy();
    }

    //快件加急
    public void speedy() {
        System.out.println("===============");
        System.out.println("打上加急标识");
    }
}
