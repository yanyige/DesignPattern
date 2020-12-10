package com.alibaba.dataworks.principle.inversion;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/10
 * @description 可以看到，增加了QQ邮箱&网易邮箱，需要在每个类中实现统一个方法。后面用依赖倒置改造下
 */
public class DependencyInversion {
    public static void main(String[] args) {
        new Email().getInfo();
        new QQEmail().getInfo();
        new NetEaseEmail().getInfo();;
    }
}

class Email {
    public void getInfo() {
        System.out.println("hello world");
    }
}

class QQEmail {
    public void getInfo() {
        System.out.println("hello qq");
    }
}

class NetEaseEmail {
    public void getInfo() {
        System.out.println("hello netease");
    }
}

class Person {
    public void receive(Email email) {
        email.getInfo();
    }
    public void receiveQQEmail(QQEmail email) {
        email.getInfo();
    }
    public void receiveNetEaseEmail(Email email) {
        email.getInfo();
    }
}