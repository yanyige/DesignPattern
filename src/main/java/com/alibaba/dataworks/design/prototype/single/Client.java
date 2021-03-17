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

        /**
         * 浅拷贝，可以看到tom5和tom6的hashCode是一致的
         */
        Sheep jerry = new Sheep("jerry", 2, "黑色");
        tom.setFriend(jerry);
        Sheep tom5 = tom.clone();
        Sheep tom6 = tom.clone();

        System.out.println(tom5);
        System.out.println(tom6);
        System.out.println(tom5.getFriend().hashCode());
        System.out.println(tom6.getFriend().hashCode());
        System.out.println(tom6.getFriend().equals(tom5.getFriend()));
        System.out.println(tom6.getFriend()==tom5.getFriend());
    }
}
