package com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.order;

import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.BJChessPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.BJGreekPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.Pizza;
import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.ChessPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.GreekPizza;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/12
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new BJGreekPizza();
        } else if ("cheese".equals(orderType)) {
            pizza = new BJChessPizza();
        }
        pizza.prepare();
        return pizza;
    }
}
