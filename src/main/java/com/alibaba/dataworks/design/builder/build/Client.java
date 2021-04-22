package com.alibaba.dataworks.design.builder.build;

/**
 * 主要方法
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/29
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 盖普通房子
         */
        CommonHouse commonHouse = new CommonHouse();

        /**
         * 指挥者开始盖房
         */
        House house = new HouseDirector(commonHouse).buildHouse();
    }
}
