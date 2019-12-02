package com.youxu.template;

public abstract class HummerModel {
    private boolean isAlarm = false;
    //模板方法
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run(){
        this.start();
        this.engineBoom();
        if(this.isAlarm){
            this.alarm();
        }
        this.stop();
    }

    //钩子方法
    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }
}
