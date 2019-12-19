package com.youxu.bridge;

public abstract class Corp {
    private Product product;
    public Corp(Product product){
        this.product = product;
    }
    public void makeMoney(){
        product.beProducted();
        product.beSelled();
    }
}
