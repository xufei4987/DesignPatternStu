package com.youxu.strategy;
//策略模式，高内聚，低耦合，易扩展
public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(()->{
            System.out.println("策略1执行中。。。");
        });
        System.out.println("执行策略1");
        context.operate();

        context = new Context(()->{
            System.out.println("策略2执行中。。。");
        });
        System.out.println("执行策略2");
        context.operate();

        context = new Context(()->{
            System.out.println("策略3执行中。。。");
        });
        System.out.println("执行策略3");
        context.operate();

    }
}
