package com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/9
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备制造希腊披萨，准备原材料");
    }
}
