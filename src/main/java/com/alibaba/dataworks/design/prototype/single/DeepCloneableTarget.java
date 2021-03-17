package com.alibaba.dataworks.design.prototype.single;

import java.io.Serializable;

/**
 * @author yige.yyg (奕格)
 * @date 2021/3/18
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected DeepCloneableTarget clone() throws CloneNotSupportedException {
        return (DeepCloneableTarget)super.clone();
    }
}
