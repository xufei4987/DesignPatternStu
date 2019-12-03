package com.youxu.mediator;
//销售管理
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number){
        super.mediator.execute("purchase.buyComputer",number);
    }

    public void refuseBuyComputer(){
        System.out.println("不再采购电脑");
    }

}
