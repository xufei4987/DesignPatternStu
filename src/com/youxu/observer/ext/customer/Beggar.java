package com.youxu.observer.ext.customer;

import com.youxu.observer.ext.event.EventCustomType;
import com.youxu.observer.ext.product.Product;
import com.youxu.observer.ext.product.ProductEvent;
import com.youxu.observer.ext.product.ProductEventType;

public class Beggar extends EventCustomer {
    public Beggar(){
        super(EventCustomType.DEL);
    }
    @Override
    public void exec(ProductEvent event) {
        Product source = event.getSource();
        ProductEventType eventType = event.getEventType();
        System.out.println("乞丐处理事件："+source.getName()+",事件的类型是："+eventType);
    }
}
