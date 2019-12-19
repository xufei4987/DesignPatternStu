package com.youxu.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        ShanzhaiCorp shanzhaiCorp = new ShanzhaiCorp(house);
        shanzhaiCorp.makeMoney();
    }
}
