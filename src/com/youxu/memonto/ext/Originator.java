package com.youxu.memonto.ext;

public class Originator {
    private String state1;
    private String state2;
    private String state3;

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    public Memonto createMemonto(){
        Memonto memonto = new Memonto();
        memonto.setStateMap(BeanUtils.backupProp(this));
        return memonto;
    }

    public void restoreMemonto(Memonto memonto){
        BeanUtils.restoreProp(this,memonto.getStateMap());
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1='" + state1 + '\'' +
                ", state2='" + state2 + '\'' +
                ", state3='" + state3 + '\'' +
                '}';
    }
}
