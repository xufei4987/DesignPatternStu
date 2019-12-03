package com.youxu.mediator;

import java.util.Random;

//销售管理
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int status = random.nextInt(100);
        System.out.println("当前电脑的销售情况为：" + status);
        return status;
    }

    public void offSale() {
        super.mediator.execute("sale.offsale");
    }

    public void sellComputer(int number){
        super.mediator.execute("sale.sellComputer",number);
    }
}
