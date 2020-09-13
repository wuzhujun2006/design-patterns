package com.wzj.decorator;

import org.aspectj.weaver.ast.Or;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:40
 * @Desc:
 */
public class Client {
    public static void main(String[] args) {
        AppleBag appleBag = new AppleBag();
        OrangeBag orangeBag = new OrangeBag();
        BananaBag bananaBag = new BananaBag();
        // 苹果纸箱包装后，外加防伪标识、加固包装
        new ReinforceBagDecorator(new CheckedBagDecorator(appleBag)).pack();
        System.out.println("*********************************");
        // 橘子网兜包装后，外加防伪标识、加急包装
        new SpeedBagDecorator(new ReinforceBagDecorator(new CheckedBagDecorator(orangeBag))).pack();

    }
}
