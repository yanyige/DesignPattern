package com.alibaba.dataworks.design.builder.build;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/29
 */
public class HighBuilding extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基2");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子造墙2");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子打顶2");
    }
}
