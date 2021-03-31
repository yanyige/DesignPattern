package com.alibaba.dataworks.design.adapter.class1;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/31
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("ok");
        } else {
            System.out.println("booooom");
        }
    }
}
