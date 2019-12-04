package com.youxu.Chain;

public class Father extends AbstractHandler {

    public Father(int level) {
        super(level);
    }

    public Father(int level, AbstractHandler nextHandler) {
        super(level, nextHandler);
    }

    @Override
    protected void response() {
        System.out.println("同意女儿的请求！");
    }
}
