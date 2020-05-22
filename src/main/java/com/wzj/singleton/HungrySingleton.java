package com.wzj.singleton;

/**
 * @Author: wzj
 * @Date: 2020/2/13 12:41
 * @Desc: 饿汉式
 *  类加载到内存后，就实例化一个单例，JVM保证线程安全
 *  简单实用，推荐使用！
 *  唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class HungrySingleton {

    //静态常量保证唯一
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    /**
     * 私有构造方法，只有本类才能调用
     */
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    public static void main(String[] args) {
        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();
        System.out.println(h1 == h2);
    }
}
