package com.youxu.observer.ext;

import com.youxu.observer.ext.customer.Beggar;
import com.youxu.observer.ext.customer.Commoner;
import com.youxu.observer.ext.customer.Noble;
import com.youxu.observer.ext.event.EventDispatch;
import com.youxu.observer.ext.product.Product;
import com.youxu.observer.ext.product.ProductManager;

public class Main {
    public static void main(String[] args) {
        EventDispatch dispatch = EventDispatch.getEventDispatch();
        dispatch.registerCustomer(new Beggar());
        dispatch.registerCustomer(new Commoner());
        dispatch.registerCustomer(new Noble());

        ProductManager productManager = new ProductManager();
        System.out.println("=======创建事件=======");
        Product apple = productManager.createProduct("苹果");
        System.out.println("=======修改事件=======");
        productManager.editProduct(apple,"小苹果");
        System.out.println("=======克隆事件=======");
        productManager.cloneProduct(apple);
        System.out.println("=======销毁事件=======");
        productManager.abandonProduct(apple);
    }
}
