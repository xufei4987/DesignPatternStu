package com.youxu.mediator;

import java.util.Random;

//销售管理
public class Sale {
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int status = random.nextInt(100);
        System.out.println("当前电脑的销售情况为：" + status);
        return status;
    }

    public void offSale() {
        Stock stock =new Stock();
        System.out.println("折价销售电脑：" + stock.getComputerStock());
    }

    public void sellComputer(int number){
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if(number > stock.getComputerStock()){
            //采购
            purchase.buyComputer(number);
        }
        stock.decrease(number);
    }
}
