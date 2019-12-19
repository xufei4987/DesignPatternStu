package com.youxu.memonto.ext;
//备忘录模式
public class MemontoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState1("1");
        originator.setState2("2");
        originator.setState3("3");
        System.out.println(originator);

        Memonto memonto = originator.createMemonto();

        originator.setState1("4");
        originator.setState2("5");
        originator.setState3("6");
        System.out.println(originator);

        originator.restoreMemonto(memonto);
        System.out.println(originator);
    }
}
