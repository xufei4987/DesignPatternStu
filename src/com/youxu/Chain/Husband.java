package com.youxu.Chain;

public class Husband extends AbstractHandler {

    public Husband(int level) {
        super(level);
    }

    public Husband(int level, AbstractHandler nextHandler) {
        super(level, nextHandler);
    }

    @Override
    protected void response() {
        System.out.println("同意老婆的请求！");
    }
}
