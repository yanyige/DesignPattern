package com.alibaba.dataworks.design.prototype.trad;

/**
 * 原型模式
 *
 * 创造十只羊
 *
 * @author yige.yyg (奕格)
 * @date 2021/3/16
 */
public class Client {
    public static void main(String[] args) {
        Sheep tom = new Sheep("tom", 1, "白色");
        Sheep tom1= new Sheep("tom", 1, "白色");
        Sheep tom2 = new Sheep("tom", 1, "白色");
    //  ... 一共创建十只
    }
}
