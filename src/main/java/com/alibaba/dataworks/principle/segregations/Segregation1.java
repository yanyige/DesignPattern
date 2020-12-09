package com.alibaba.dataworks.principle.segregations;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/9
 * @description 根据接口隔离原则改良版本
 */
public class Segregation1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.dependency1(new B1());
        a1.dependency2(new B1());
        a1.dependency3(new B1());

        C1 c1 = new C1();
        c1.dependency1(new D1());
        c1.dependency4(new D1());
        c1.dependency5(new D1());
    }
}

interface Interface2 {
    void operation1();
}

interface Interface3 {
    void operation2();
    void operation3();
}

interface Interface4 {
    void operation4();
    void operation5();
}

class B1 implements Interface2, Interface3 {

    public void operation1() {
        System.out.println("B1 implements operation1");
    }

    public void operation2() {
        System.out.println("B1 implements operation2");
    }

    public void operation3() {
        System.out.println("B1 implements operation3");
    }
}

class D1 implements Interface2, Interface4 {

    public void operation1() {
        System.out.println("D1 implements operation1");
    }

    public void operation4() {
        System.out.println("D1 implements operation4");
    }

    public void operation5() {
        System.out.println("D1 implements operation5");
    }
}

class A1 {
    public void dependency1(Interface2 interface2) {
        interface2.operation1();
    }
    public void dependency2(Interface3 interface3) {
        interface3.operation2();
    }
    public void dependency3(Interface3 interface3) {
        interface3.operation3();
    }
}

class C1 {
    public void dependency1(Interface2 interface2) {
        interface2.operation1();
    }
    public void dependency4(Interface4 interface4) {
        interface4.operation4();
    }
    public void dependency5(Interface4 interface4) {
        interface4.operation5();
    }
}