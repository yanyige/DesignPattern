package com.alibaba.dataworks.design.prototype.single;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
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

    /**
     * 深拷贝 方式一 重写clone
     * @return DeepPrototype
     * @throws CloneNotSupportedException
     */
    @Override
    protected DeepPrototype clone() throws CloneNotSupportedException {
        // 1. 完成基本属性 clone
        DeepPrototype deepPrototype = (DeepPrototype)super.clone();
        // 2. 处理DeepCloneableTarget
        deepPrototype.deepCloneableTarget = deepCloneableTarget.clone();
        return deepPrototype;
    }

    /**
     * 深拷贝 方式二 通过对象实例化实现（推荐方式）
     * @return
     */
    public Object deepClone() {
        // 创建流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前对象以对象流方式输出
            oos.writeObject(this);

            // 反序列化回来
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype deepPrototype = (DeepPrototype)ois.readObject();
            return deepPrototype;
        } catch (Exception e) {
            // 打印错误信息
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception ex) {
                // 打印错误信息
                ex.printStackTrace();
            }
        }
        return null;
    }
}
