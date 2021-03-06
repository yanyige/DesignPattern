package com.alibaba.dataworks.design.prototype.trad;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/16
 */
public class Sheep {

    private String name;
    private int age;
    private String color;

    private Sheep friend;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", color='" + color + '\'' +
            '}';
    }
}
