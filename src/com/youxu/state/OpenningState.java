package com.youxu.state;

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("lift open...");
    }

    @Override
    public void close() {
        super.context.setCurState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        System.out.println("invalid operation");
    }

    @Override
    public void stop() {
        System.out.println("invalid operation");
    }
}
