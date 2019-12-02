package com.youxu.prototype;

/**
 * 原型模式的优点：
 * 1、比new的性能更好，产生大量对象时可以使用
 * 2、逃避构造函数的约束
 * 注意：引用类型的成员变量和数组是不会拷贝的，还是原对象的引用(浅拷贝)
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setDesc("111");
        subject.setId(11);
        subject.setName("111");
        subject.getList().add("111");
        Subject clone = subject.clone();
        clone.getList().add("222");
        System.out.println(subject.getList());
        System.out.println(clone.getList());
    }
}
