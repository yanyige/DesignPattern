package com.alibaba.dataworks.design.singleton.type5;

/**
 * 双重检查
 *
 * 步骤：
 * 1. 构造器私有化（防止new）
 * 2. 提供一个静态共有方法，当使用到该方法时，才会去创建instance
 * 3. 添加同步锁，锁住的方法也要判断实例是否初始化，双重检查
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/8
 */
public class Singleton5 {
    public static void main(String[] args) {

    }
}

class Singleton {

    private static volatile Singleton INSTANCE;

    private Singleton() {}

    public Singleton getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}