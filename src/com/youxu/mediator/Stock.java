package com.youxu.mediator;
//库存管理
public class Stock {
    private static int COMPUTER_STOCK = 100;

    public void increase(int number) {
        COMPUTER_STOCK = COMPUTER_STOCK + number;
        System.out.println("电脑库存为：" + COMPUTER_STOCK);
    }

    public void decrease(int number){
        COMPUTER_STOCK = COMPUTER_STOCK - number;
        System.out.println("电脑库存为：" + COMPUTER_STOCK);
    }

    public int getComputerStock() {
        return COMPUTER_STOCK;
    }

    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为：" + COMPUTER_STOCK);
        //折价销售
        sale.offSale();
        //不再采购
        purchase.refuseBuyComputer();
    }

}
