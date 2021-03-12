package com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza;


/**
 * @author yige.yyg (奕格)
 * @date 2021/3/9
 */
public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("敦希腊披萨");
        System.out.println("准备制造伦敦希腊披萨，准备原材料");
    }
}
