package com.youxu.bridge;

public class House extends Product{
    @Override
    public void beProducted() {
        System.out.println("建造房子");
    }

    @Override
    public void beSelled() {
        System.out.println("銷售房子");
    }
}
