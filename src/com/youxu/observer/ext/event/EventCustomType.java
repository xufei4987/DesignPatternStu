package com.youxu.observer.ext.event;

public enum EventCustomType {
    NEW(1),
    DEL(2),
    EDIT(3),
    CLONE(4);

    private int value;

    public int getValue() {
        return value;
    }

    EventCustomType(int value) {
        this.value = value;
    }
}
