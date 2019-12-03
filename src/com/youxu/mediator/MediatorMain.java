package com.youxu.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        System.out.println("------采购人员采购电脑-------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(50);

        System.out.println("------销售人员销售电脑-------");
        Sale sale = new Sale(mediator);
        sale.sellComputer(10);

        System.out.println("------库房管理人员清除库存-------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
