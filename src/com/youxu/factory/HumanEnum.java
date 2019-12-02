package com.youxu.factory;

public enum HumanEnum {
    MALE_CHINESE(MaleChinese.class),
    FEMALE_CHINESE(FemaleChinese.class),
    MALE_EUROPEAN(MaleEuropean.class),
    FEMALE_EUROPEAN(FemaleEuropean.class);

    private Class classType;

    HumanEnum(Class<? extends Human> clazz){
        this.classType = clazz;
    }

    public Class getClassType() {
        return classType;
    }

    public void setClassType(Class classType) {
        this.classType = classType;
    }
}
