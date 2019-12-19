package com.youxu.state;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setCurState(Context.OPENNING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("lift close");
    }

    @Override
    public void run() {
        super.context.setCurState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setCurState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
