package com.youxu.observer.ext.customer;

import com.youxu.observer.ext.event.EventCustomType;
import com.youxu.observer.ext.product.Product;
import com.youxu.observer.ext.product.ProductEvent;
import com.youxu.observer.ext.product.ProductEventType;

public class Noble extends EventCustomer {
    public Noble() {
        super(EventCustomType.EDIT);
        super.addCustomType(EventCustomType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        Product source = event.getSource();
        ProductEventType eventType = event.getEventType();
        System.out.println("贵族处理事件："+source.getName()+",事件的类型是："+eventType);
    }
}
