package com.youxu.prototype;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Cloneable{
    private int id;
    private String name;
    private String desc;
    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    protected Subject clone(){
        Subject subject = null;
        try {
            subject = (Subject) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return subject;
    }
}
