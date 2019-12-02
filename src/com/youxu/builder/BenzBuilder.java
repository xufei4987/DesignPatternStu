package com.youxu.builder;

import java.util.List;

public class BenzBuilder extends CarBuilder {
    CarModel carModel = new BenzModel();
    @Override
    public void setSequence(List<String> sequence) {
        carModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return carModel;
    }
}
