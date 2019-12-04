package com.youxu.mediator;

public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... args) {
        if (("purchase.buyComputer").equals(str)) {
            buyComputer((Integer)args[0]);
        }else if(("sale.sellComputer").equals(str)){
            sellComputer((Integer)args[0]);
        }else if(("sale.offsale").equals(str)){
            offsale();
        }else if(("stock.clear").equals(str)){
            clear();
        }
    }

    private void clear() {
        System.out.println("清理存货数量为：" + super.stock.getComputerStock());
        //折价销售
        super.sale.offSale();
        //不再采购
        super.purchase.refuseBuyComputer();
    }

    private void offsale() {
        System.out.println("折价销售电脑：" + super.stock.getComputerStock());
    }

    private void sellComputer(int number) {
        System.out.println("销售电脑数量：" + number);
        if(number > super.stock.getComputerStock()){
            //采购
            super.purchase.buyComputer(number);
        }
        super.stock.decrease(number);
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus > 60){
            System.out.println("采购电脑" + number + "台");
            super.stock.increase(number);
        }else {
            System.out.println("采购电脑" + number/2 + "台");
            super.stock.increase(number/2);
        }
    }
}
