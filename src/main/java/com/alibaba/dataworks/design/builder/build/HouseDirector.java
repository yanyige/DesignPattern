package com.alibaba.dataworks.design.builder.build;

/**
 * 指挥者
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/29
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    /**
     * 构造方式初始化
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * setter 初始化
     * @param houseBuilder houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
