package com.youxu.bridge;

public class ShanzhaiCorp extends Corp {
    public ShanzhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司賺錢了");
    }
}
