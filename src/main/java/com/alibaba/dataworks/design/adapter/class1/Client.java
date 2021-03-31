package com.alibaba.dataworks.design.adapter.class1;

/**
 * 使用类适配器模式进行充电
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/31
 */
public class Client {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new VoltageAdapter());

    }
}
