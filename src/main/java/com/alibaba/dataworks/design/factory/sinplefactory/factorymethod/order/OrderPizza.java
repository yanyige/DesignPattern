package com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.alibaba.dataworks.design.factory.sinplefactory.factorymethod.pizza.Pizza;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/12
 */
public abstract class OrderPizza {

    public static void main(String[] args) {
        String orderType = getType();
        new BJOrderPizza().createPizza(orderType);
    }

    abstract Pizza createPizza(String orderType);

    private static String getType() {
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
