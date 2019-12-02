package com.youxu.factory;

public class FactoryMain {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        MaleHumanFactory factory = new MaleHumanFactory();
        Human maleChinese = factory.createMaleChinese();
        Human maleEuropean = factory.createMaleEuropean();
        maleChinese.sex();
        maleChinese.lautf();
        maleEuropean.sex();
        maleEuropean.lautf();

    }
}
