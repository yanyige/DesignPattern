package com.alibaba.dataworks.design.adapter.class1;

/**
 * 适配器类
 * @author yige.yyg (奕格)
 * @date 2021/3/31
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    public int output5V() {
        return outPut220V() / 44;
    }
}
