package com.alibaba.dataworks.principle.segregations;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/9
 * @description 描述 Segregation Class uml 设计
 */
public class Segregation {

    public static void main(String[] args) {
        A a = new A();
        a.dependency1(new B());
        a.dependency2(new B());
        a.dependency3(new B());

        C c = new C();
        c.dependency1(new D());
        c.dependency4(new D());
        c.dependency5(new D());
    }
}

/**
 * 可以看到，接口B、D多实现了2个方法，这是不合适的
 */
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {

    public void operation1() {
        System.out.println("B implements operation1");
    }

    public void operation2() {
        System.out.println("B implements operation2");
    }

    public void operation3() {
        System.out.println("B implements operation3");
    }

    public void operation4() {
        System.out.println("B implements operation4");
    }

    public void operation5() {
        System.out.println("B implements operation5");
    }
}

class D implements Interface1 {

    public void operation1() {
        System.out.println("D implements operation1");
    }

    public void operation2() {
        System.out.println("D implements operation2");
    }

    public void operation3() {
        System.out.println("D implements operation3");
    }

    public void operation4() {
        System.out.println("D implements operation4");
    }

    public void operation5() {
        System.out.println("D implements operation5");
    }
}

/**
 * A类通过接口interface1使用B类，但是仅仅用到了1，2，3三个操作
 */
class A {
    public void dependency1(Interface1 interface1) {
        interface1.operation1();
    }
    public void dependency2(Interface1 interface1) {
        interface1.operation2();
    }
    public void dependency3(Interface1 interface1) {
        interface1.operation3();
    }
}

/**
 * C类通过接口interface1使用D类，但是仅仅用到了1，4，5三个操作
 */
class C {
    public void dependency1(Interface1 interface1) {
        interface1.operation1();
    }
    public void dependency4(Interface1 interface1) {
        interface1.operation4();
    }
    public void dependency5(Interface1 interface1) {
        interface1.operation5();
    }
}