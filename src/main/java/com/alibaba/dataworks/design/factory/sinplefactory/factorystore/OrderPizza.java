package com.alibaba.dataworks.design.factory.sinplefactory.factorystore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.Pizza;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/11
 */
public class OrderPizza {

    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";

        this.simpleFactory = simpleFactory;
        Pizza pizza;

        while (true) {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
        }
    }

    private String getType() {
        try {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input pizza type:");
            return stdin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
