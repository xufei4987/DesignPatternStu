package com.youxu.chain;

public class Son extends AbstractHandler {

    public Son(int level) {
        super(level);
    }

    public Son(int level, AbstractHandler nextHandler) {
        super(level, nextHandler);
    }

    @Override
    protected void response() {
        System.out.println("同意母亲的请求！");
    }
}
