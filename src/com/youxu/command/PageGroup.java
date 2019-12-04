package com.youxu.command;

public class PageGroup implements Group {
    @Override
    public void find() {
        System.out.println("find page group......");
    }

    @Override
    public void add() {
        System.out.println("add page......");
    }

    @Override
    public void delete() {
        System.out.println("delete page......");
    }

    @Override
    public void change() {
        System.out.println("change page......");
    }

    @Override
    public void plan() {
        System.out.println("plan page......");
    }
}
