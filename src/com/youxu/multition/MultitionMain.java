package com.youxu.multition;
//多例模式
public class MultitionMain {
    public static void main(String[] args) {
        System.out.println(LimitMultitionEntity.getInstence());
        System.out.println(LimitMultitionEntity.getInstence());
        System.out.println(LimitMultitionEntity.getInstence());
        System.out.println(LimitMultitionEntity.getInstence());
    }
}
