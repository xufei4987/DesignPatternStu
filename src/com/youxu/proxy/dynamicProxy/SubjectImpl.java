package com.youxu.proxy.dynamicProxy;

public class SubjectImpl implements Subject {
    @Override
    public void doSomething() {
        System.out.println("do something!");
    }
}
