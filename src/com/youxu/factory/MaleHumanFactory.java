package com.youxu.factory;

public class MaleHumanFactory extends HumanFactory {
    public Human createMaleChinese() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return super.createHuman(HumanEnum.MALE_CHINESE.getClassType());
    }

    public Human createMaleEuropean() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return super.createHuman(HumanEnum.MALE_EUROPEAN.getClassType());
    }
}
