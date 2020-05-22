package com.wzj.observer.example1;

/**
 * @Author: wzj
 * @Date: 2019/10/3 15:38
 * @Desc:
 */
public class Client {
    public static void main(String[] args) {
        //进口蛇果
        ImportedRedDeliciousApple apple = new ImportedRedDeliciousApple();

        //初始化预定客户类
        CustomerObserver mei = new CustomerObserver("小美");
        CustomerObserver jing = new CustomerObserver("小静");
        CustomerObserver tao = new CustomerObserver("小陶");

        //将小美、小静、小陶加入水果店的预定客户列表中
        apple.addObserver(mei);
        apple.addObserver(jing);
        apple.addObserver(tao);

        //通知客户
        apple.notifyObservers();
    }

}
