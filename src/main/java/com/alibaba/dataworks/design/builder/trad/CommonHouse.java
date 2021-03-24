package com.alibaba.dataworks.design.builder.trad;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/24
 */
public class CommonHouse extends AbstractHouse {

    String name;

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子建屋顶");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
