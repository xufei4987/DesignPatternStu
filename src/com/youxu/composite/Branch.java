package com.youxu.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {
    private List<Corp> subList = new ArrayList<>();
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSub(Corp corp){
        this.subList.add(corp);
    }

    public List<Corp> getSubList() {
        return this.subList;
    }
}
