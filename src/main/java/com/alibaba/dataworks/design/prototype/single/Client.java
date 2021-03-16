package com.alibaba.dataworks.design.prototype.single;



/**
 * @author yige.yyg (奕格)
 * @date 2021/3/16
 */
public class Client {
    public static void main(String[] args) {
        Sheep tom = new Sheep("tom", 1, "白色");
        Sheep tom1 = tom.clone();
        Sheep tom2 = tom.clone();
        Sheep tom3 = tom.clone();
        Sheep tom4 = tom.clone();
    }
}
