package com.youxu.observer;

import java.util.HashSet;
import java.util.Set;

public class HanFeiZi implements IHanFeiZi,Observable {
    private Set<Observer> observers = new HashSet<>();
    @Override
    public void haveBreakfast() {
        System.out.println("开始吃饭。。。");
        this.notifyObservers("韩非子开始吃饭了。。。");
    }

    @Override
    public void haveFun() {
        System.out.println("开始娱乐。。。");
        this.notifyObservers("韩非子开始娱乐了。。。");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer observer : observers){
            observer.update(context);
        }
    }
}
