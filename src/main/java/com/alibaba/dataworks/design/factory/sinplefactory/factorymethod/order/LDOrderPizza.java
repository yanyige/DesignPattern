package com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.order;

import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.BJChessPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.BJGreekPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.LDChessPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.LDGreekPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.Pizza;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/12
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new LDGreekPizza();
            pizza.setName("ldgreek");
        } else if ("cheese".equals(orderType)) {
            pizza = new LDChessPizza();
            pizza.setName("ldheese");
        }
        return pizza;
    }
}
