package com.youxu.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        IUserInfo outerUserInfo = new OuterUserInfo();
        System.out.println(userInfo.getUserName());
        System.out.println(outerUserInfo.getUserName());
    }
}
