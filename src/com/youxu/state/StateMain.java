package com.youxu.state;

/**
 * 状态模式
 */
public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurState(Context.STOPPING_STATE);
        context.run();
        context.stop();
        context.open();
        context.close();
    }
}
