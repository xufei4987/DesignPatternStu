package com.youxu.memonto;

public class Boy {
    private String state;
    public String getState(){
        return  state;
    }
    public void setState(String state){
        this.state = state;
    }
    public void changeState(){
        System.out.println("心情可能不好！");
    }
    public Memonto createMemonto(){
        Memonto memonto = new Memonto();
        memonto.setState(this.state);
        return memonto;
    }
    public void restoreMemonto(Memonto memonto){
        this.state = memonto.getState();
    }
}
