package com.youxu.composite;

public abstract class Corp {
    private String name;
    private String position;
    private int salary;

    public Corp(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getCorpInfo(){
        return "名字："+this.name+"\t职位："+this.position+"\t工资："+this.salary;
    }
}
