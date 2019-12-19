package com.youxu.bridge;

public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地產公司賺大錢了");
    }
}
