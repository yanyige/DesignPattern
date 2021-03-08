package com.alibaba.dataworks.design.singleton.type4;

/**
 * 懒汉式（线程安全，同步方法）
 *
 * 步骤：
 * 1. 构造器私有化（防止new）
 * 2. 提供一个静态共有方法，当使用到该方法时，才会去创建instance
 * 3. 保证该方法在执行时是同步的，添加同步锁
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/8
 */
public class Singleton4 {
    public static void main(String[] args) {

    }
}

class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {}

    /**
     * 提供一个静态共有方法，当使用到该方法时，才会去创建instance，加入同步处理逻辑
     */
    public static synchronized Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}