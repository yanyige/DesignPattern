package com.alibaba.dataworks.design.prototype.single;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/16
 */

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    private Sheep friend;

    public String getName() {
        return name;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
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
            ", friend=" + friend +
            '}';
    }

    /**
     * 克隆这个实例，使用默认的克隆方法
     */
    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            // log.warn("clone not supported")
            e.printStackTrace();
        }
        return sheep;
    }
}
