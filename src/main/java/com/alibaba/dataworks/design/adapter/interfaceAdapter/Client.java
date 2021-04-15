package com.alibaba.dataworks.design.adapter.interfaceAdapter;

/**
 * 我用适配器，只需要Foo1
 * @author yige.yyg (奕格)
 * @date 2021/4/14
 */
public class Client {

    public static void main(String[] args) {
        InterfaceT interfaceT = new AbstractAdapter() {
            @Override
            public void Foo1() {
                System.out.println("foo1 build");
            }
        };
        interfaceT.Foo1();
    }
}
