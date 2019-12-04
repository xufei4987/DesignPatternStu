package com.youxu.command;

public class CodeGroup implements Group {
    @Override
    public void find() {
        System.out.println("find code group......");
    }

    @Override
    public void add() {
        System.out.println("add code......");
    }

    @Override
    public void delete() {
        System.out.println("delete code......");
    }

    @Override
    public void change() {
        System.out.println("change code......");
    }

    @Override
    public void plan() {
        System.out.println("plan code......");
    }
}
