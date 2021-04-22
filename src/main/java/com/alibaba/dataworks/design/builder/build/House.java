package com.alibaba.dataworks.design.builder.build;

/**
 * 产品 product
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/29
 */

public class House {
    private String basic;
    private String wall;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    private String roof;
}
