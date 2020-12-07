package com.alibaba.dataworks.principle.singleresponsibility;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/7
 */
public class SingleResponse {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("moto");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(String.format("%s is walking on the road", vehicle));
    }
}