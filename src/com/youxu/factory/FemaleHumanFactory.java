package com.youxu.factory;

public class FemaleHumanFactory extends HumanFactory {
    public Human createFemaleChinese() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return super.createHuman(HumanEnum.FEMALE_CHINESE.getClassType());
    }

    public Human createFemaleEuropean() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return super.createHuman(HumanEnum.FEMALE_EUROPEAN.getClassType());
    }
}
