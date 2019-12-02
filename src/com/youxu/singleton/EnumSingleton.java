package com.youxu.singleton;
//单例模式的最佳实践，并支持在涉及到反射和序列化的单例
public enum EnumSingleton {
    INSTENCS;
    public void doSomething(){
        System.out.println("枚举单例");
    }
}
