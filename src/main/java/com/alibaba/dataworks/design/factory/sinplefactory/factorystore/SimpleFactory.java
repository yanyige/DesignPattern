package com.alibaba.dataworks.design.factory.sinplefactory.factorystore;

import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.ChessPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.GreekPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.Pizza;

/**
 * 简单工厂模式
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/10
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType) {

        System.out.println("使用简单工厂模式");

        Pizza pizza = null;

        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if ("cheese".equals(orderType)) {
            pizza = new ChessPizza();
            pizza.setName("cheese");
        }

        return pizza;
    }
}
