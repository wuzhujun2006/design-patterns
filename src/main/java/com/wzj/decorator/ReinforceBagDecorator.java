package com.wzj.decorator;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:34
 * @Desc: 加固装饰器
 */
public class ReinforceBagDecorator extends BagDecorator{
    public ReinforceBagDecorator(Bag bag) {
        super(bag);
    }

    public void pack() {
        super.pack();  //调用原有业务方法
        reinforce();
    }

    //加固包装
    public void reinforce() {
        System.out.println("===============");
        System.out.println("加固了包装");
    }
}
