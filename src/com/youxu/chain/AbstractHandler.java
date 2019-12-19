package com.youxu.chain;

public abstract class AbstractHandler{
    private int level;
    private AbstractHandler nextHandler;
    public AbstractHandler(int level){
        this(level,null);
    }

    public AbstractHandler(int level, AbstractHandler nextHandler){
        this.level = level;
        this.nextHandler = nextHandler;
    }

    public void handlerMessage(IWomen women) {
        if (this.level == women.getType()) {
            System.out.println(women.getRequest());
            response();
        }else {
            if(nextHandler != null){
                nextHandler.handlerMessage(women);
            }else {
                System.out.println("无法处理！");
            }
        }
    }

    protected abstract void response();
}
