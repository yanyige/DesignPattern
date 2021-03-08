package com.alibaba.dataworks.design.singleton.type1;

/**
 * 饿汉式（静态常量）
 * 步骤：
 * 1. 构造器私有化（防止new
 * 2. 类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/8
 */
public class Singleton1 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // 可以发现两个类hashcode相同
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


class Singleton {
    /**
     * 1. 构造器私有化
     */
    private Singleton(){}

    /**
     * 2. 本类内部创建对象实例
     */
    private static final Singleton INSTANCE = new Singleton();

    /**
     * 3. 对外提供一个共有的方法，返回实例对象
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}