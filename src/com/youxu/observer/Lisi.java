package com.youxu.observer;

public class Lisi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯发现韩非子的行动。。。");
        reportToEmperor(context);
    }

    private void reportToEmperor(String context){
        System.out.println("报告皇帝--->" + context);
    }
}
