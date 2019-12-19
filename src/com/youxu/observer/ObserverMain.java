package com.youxu.observer;

public class ObserverMain {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        Observer lisi = new Lisi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
