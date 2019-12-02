package com.youxu.singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){

    }

    public static StaticInnerClassSingleton getInstence(){
        return inner.instence;
    }

    private static class inner{
        private static final StaticInnerClassSingleton instence = new StaticInnerClassSingleton();
    }
}
