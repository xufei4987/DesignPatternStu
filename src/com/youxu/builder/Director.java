package com.youxu.builder;

import java.util.ArrayList;
import java.util.List;

//导演类，安排建造
public class Director {
    private List<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmwBuilder = new BmwBuilder();

    public BmwModel getBwmModelA(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return (BmwModel) bmwBuilder.getCarModel();
    }

    public BmwModel getBwmModelB(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return (BmwModel) bmwBuilder.getCarModel();
    }

    public BenzModel getBenzModelA(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BenzModel getBenzModelB(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }
}
