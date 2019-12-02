package com.youxu.factory;

public abstract class HumanFactory {
    protected Human createHuman(Class<? extends Human> clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}



