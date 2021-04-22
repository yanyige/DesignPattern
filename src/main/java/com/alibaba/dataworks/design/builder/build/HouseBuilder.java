package com.alibaba.dataworks.design.builder.build;

/**
 * 抽象建造者
 * @author yige.yyg (奕格)
 * @date 2021/3/29
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
