package com.alibaba.dataworks.design.singleton.type3;

/**
 * 懒汉式（线程不安全）
 *
 * 1. 构造器私有化（防止new
 * 2. 提供一个静态共有方法，当使用到该方法时，才会去创建instance
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/8
 */
public class Singleton3 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // 可以发现两个类hashcode相同
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {}

    /**
     * 提供一个静态共有方法，当使用到该方法时，才会去创建instance
     */
    public static Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}