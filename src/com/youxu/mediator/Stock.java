package com.youxu.mediator;
//库存管理
public class Stock extends AbstractColleague{
    private static int COMPUTER_STOCK = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

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
        super.mediator.execute("stock.clear");
    }

}
