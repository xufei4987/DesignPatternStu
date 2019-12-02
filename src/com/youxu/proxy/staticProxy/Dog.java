package com.youxu.proxy.staticProxy;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }

    @Override
    public void bark() {
        System.out.println("汪汪叫");
    }
}
