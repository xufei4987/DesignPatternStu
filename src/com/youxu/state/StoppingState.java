package com.youxu.state;

public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setCurState(Context.OPENNING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setCurState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setCurState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("lift stop");
    }
}
