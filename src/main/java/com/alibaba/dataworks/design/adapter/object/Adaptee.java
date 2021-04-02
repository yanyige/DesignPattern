package com.alibaba.dataworks.design.adapter.object;

/**
 * 适配者接口
 *
 * @author yige.yyg (奕格)
 * @date 2021/4/2
 */

class Adaptee  {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}