package com.youxu.chain;
//责任链模式，核心在于处理链
public class ChainMain {
    public static void main(String[] args) {
        IWomen women = new Women(1,"出去逛街");
        AbstractHandler son = new Son(3);
        AbstractHandler husband = new Husband(2,son);
        AbstractHandler father = new Father(1,husband);
        father.handlerMessage(women);
    }
}
