package com.youxu.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class proxyMain {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        Subject proxySub = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), (proxy, method, _args) -> {
            System.out.println("before invoked....");
            Object ret = method.invoke(subject, _args);
            System.out.println("after invoked....");
            return ret;
        });
        proxySub.doSomething();
    }
}
