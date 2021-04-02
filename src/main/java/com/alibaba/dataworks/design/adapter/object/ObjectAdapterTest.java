package com.alibaba.dataworks.design.adapter.object;

/**
 * 客户端代码
 *
 * @author yige.yyg (奕格)
 * @date 2021/4/2
 */

public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}