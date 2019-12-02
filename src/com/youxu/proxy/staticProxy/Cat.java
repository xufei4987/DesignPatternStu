package com.youxu.proxy.staticProxy;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }

    @Override
    public void bark() {
        System.out.println("喵喵叫");
    }
}
