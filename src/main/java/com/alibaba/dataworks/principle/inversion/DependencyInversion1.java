package com.alibaba.dataworks.principle.inversion;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/10
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        new Email1().receive(new QQEmail1());
        new Email1().receive(new NetEaseEmail1());
    }
}

interface Reciever {
    void getInfo();
}

class Email1 {
    public void receive(Reciever reciever) {
        reciever.getInfo();
    }
}

class QQEmail1 implements Reciever {

    public void getInfo() {
        System.out.println("hello QQ");
    }
}

class NetEaseEmail1 implements Reciever {
    public void getInfo() {
        System.out.println("hello netwase");
    }
}