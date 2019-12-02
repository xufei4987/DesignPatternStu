package com.youxu.builder;

import java.util.List;

public class BmwBuilder extends CarBuilder {
    CarModel carModel = new BmwModel();
    @Override
    public void setSequence(List<String> sequence) {
        carModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return carModel;
    }
}
