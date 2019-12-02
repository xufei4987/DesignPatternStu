package com.youxu.mediator;
//销售管理
public class Purchase {
    public void buyComputer(int number){
        Stock stock = new Stock();
        Sale sale = new Sale();

        int saleStatus = sale.getSaleStatus();
        if(saleStatus > 60){
            System.out.println("采购电脑" + number + "台");
            stock.increase(number);
        }else {
            stock.increase(number/2);
        }
    }

    public void refuseBuyComputer(){
        System.out.println("不再采购电脑");
    }

}
