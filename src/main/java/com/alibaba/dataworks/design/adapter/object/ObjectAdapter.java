package com.alibaba.dataworks.design.adapter.object;

/**
 * @author yige.yyg (奕格)
 * @date 2021/4/2
 */
public class ObjectAdapter implements Target {

        private Adaptee adaptee;
        public ObjectAdapter(Adaptee adaptee)  {
            this.adaptee=adaptee;
        }
        public void request()
        {
            adaptee.specificRequest();
        }
    }

