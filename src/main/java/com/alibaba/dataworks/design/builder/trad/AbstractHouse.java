package com.alibaba.dataworks.design.builder.trad;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/24
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
