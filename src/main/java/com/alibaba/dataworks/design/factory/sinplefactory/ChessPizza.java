package com.alibaba.dataworks.design.factory.sinplefactory;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/9
 */
public class ChessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备制造奶酪披萨，准备原材料");
    }
}
