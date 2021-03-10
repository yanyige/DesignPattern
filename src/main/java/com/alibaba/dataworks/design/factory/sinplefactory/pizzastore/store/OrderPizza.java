package com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.ChessPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.GreekPizza;
import com.alibaba.dataworks.design.factory.sinplefactory.pizzastore.pizza.Pizza;

/**
 * 订购pizza类
 * 不使用工厂的实现方式(错误的实现)
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/10
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;

        while (true) {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("greek");
            } else if ("cheese".equals(orderType)) {
                pizza = new ChessPizza();
                pizza.setName("cheese");
            } else {
                System.out.println("不存在这种pizza");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.box();
            pizza.cut();
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
