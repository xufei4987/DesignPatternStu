package com.youxu.memonto;
//备忘录模式
public class MemontoMain {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情不错。。。");
        System.out.println(boy.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemonto(boy.createMemonto());
        boy.changeState();
        boy.restoreMemonto(caretaker.getMemonto());
        System.out.println(boy.getState());
    }
}
