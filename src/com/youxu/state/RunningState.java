package com.youxu.state;

public class RunningState extends LiftState {
    @Override
    public void open() {
        System.out.println("invalid operation");
    }

    @Override
    public void close() {
        System.out.println("invalid operation");
    }

    @Override
    public void run() {
        System.out.println("lift running");
    }

    @Override
    public void stop() {
        super.context.setCurState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
