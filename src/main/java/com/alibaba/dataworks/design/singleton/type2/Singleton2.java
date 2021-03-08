package com.alibaba.dataworks.design.singleton.type2;

/**
 * 饿汉式（静态代码块）
 * 与Type1类似， 只是使静态代码块初始化实例对象
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/8
 */
public class Singleton2 {

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
    private static Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }


    /**
     * 3. 对外提供一个共有的方法，返回实例对象
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}