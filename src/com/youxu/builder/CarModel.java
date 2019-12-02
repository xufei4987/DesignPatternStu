package com.youxu.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        sequence.forEach(s -> {
            if (s.equals("start")) {
                this.start();
            } else if (s.equals("stop")) {
                this.stop();
            } else if (s.equals("alarm")) {
                this.alarm();
            } else if (s.equals("engineBoom")) {
                this.engineBoom();
            }
        });
    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
