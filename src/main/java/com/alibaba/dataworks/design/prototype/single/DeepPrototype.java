package com.alibaba.dataworks.design.prototype.single;

import java.io.Serializable;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/18
 */
public class DeepPrototype implements Serializable, Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
    }

    // 深拷贝 方式一 重写clone

    @Override
    protected DeepPrototype clone() throws CloneNotSupportedException {
        // 1. 完成基本属性 clone
        DeepPrototype deepPrototype = (DeepPrototype)super.clone();
        // 2. 处理DeepCloneableTarget
        deepPrototype.deepCloneableTarget = deepCloneableTarget.clone();
        return deepPrototype;
    }
}
