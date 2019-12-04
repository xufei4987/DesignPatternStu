package com.youxu.command;

public class RequirementGroup implements Group {
    @Override
    public void find() {
        System.out.println("find requirement group......");
    }

    @Override
    public void add() {
        System.out.println("add requirement......");
    }

    @Override
    public void delete() {
        System.out.println("delete requirement......");
    }

    @Override
    public void change() {
        System.out.println("change requirement......");
    }

    @Override
    public void plan() {
        System.out.println("plan requirement......");
    }
}
