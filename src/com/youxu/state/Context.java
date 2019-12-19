package com.youxu.state;

public class Context {
    public final static OpenningState OPENNING_STATE = new OpenningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();

    private LiftState curState;

    public LiftState getCurState() {
        return curState;
    }

    public void setCurState(LiftState curState) {
        this.curState = curState;
        this.curState.setContext(this);
    }

    public void open(){
        curState.open();
    }

    public void close(){
        curState.close();
    }

    public void run(){
        curState.run();
    }

    public void stop(){
        curState.stop();
    }
}
