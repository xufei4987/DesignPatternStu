package com.youxu.proxy.staticProxy;
//代理模式，设置统一的代理类进行代理的执行
public class ProxyMain {
    public static void main(String[] args) {
        AnimalProxy animalProxy = new AnimalProxy(new Dog());
        animalProxy.eat();
        animalProxy.bark();
        animalProxy = new AnimalProxy(new Cat());
        animalProxy.eat();
        animalProxy.bark();
    }
}
