package com.youxu.singleton;

public class DoubleCheckSingleton {
    private DoubleCheckSingleton() {

    }

    private volatile static DoubleCheckSingleton instence;

    public static DoubleCheckSingleton getInstence() {
        if (instence == null) {
            synchronized (DoubleCheckSingleton.class){
                if(instence == null){
                    instence = new DoubleCheckSingleton();
                }
            }
        }
        return instence;
    }
}
/**
 * 1、延迟初始化。和懒汉模式一致，只有在初次调用静态方法getSingleton，才会初始化signleton实例。
 * 2、性能优化。同步会造成性能下降，在同步前通过判读singleton是否初始化，减少不必要的同步开销。
 * 3、线程安全。同步创建Singleton对象，同时注意到静态变量singleton使用volatile修饰。
 * 为什么要使用volatile修饰？
 *
 * 虽然已经使用synchronized进行同步，但在创建对象时，会有下面的伪代码：
 *
 * memory=allocate(); //1：分配内存空间
 * ctorInstance();   //2:初始化对象
 * singleton=memory; //3:设置singleton指向刚排序的内存空间
 * 当线程A在执行上面伪代码时，2和3可能会发生重排序，因为重排序并不影响运行结果，还可以提升性能，所以JVM是允许的。
 * 如果此时伪代码发生重排序，步骤变为1->3->2,线程A执行到第3步时，线程B调用getsingleton方法，在判断singleton==null时不为null，则返回singleton。
 * 但此时singleton并还没初始化完毕，线程B访问的将是个还没初始化完毕的对象。当声明对象的引用为volatile后，伪代码的2、3的重排序在多线程中将被禁止!
 *
 */
