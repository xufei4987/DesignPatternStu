package com.youxu.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.buyComputer(100);

        Sale sale = new Sale();
        sale.sellComputer(1);

        Stock stock = new Stock();
        stock.clearStock();
    }
}
