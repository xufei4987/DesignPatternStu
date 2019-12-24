package com.youxu.observer.ext.event;

import com.youxu.observer.ext.customer.EventCustomer;
import com.youxu.observer.ext.product.Product;
import com.youxu.observer.ext.product.ProductEvent;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class EventDispatch implements Observer {

    private final static EventDispatch eventDispatch = new EventDispatch();

    private Set<EventCustomer> customerSet = new HashSet<>();

    private EventDispatch(){
    }

    public static EventDispatch getEventDispatch() {
        return eventDispatch;
    }

    public void registerCustomer(EventCustomer eventCustomer){
        customerSet.add(eventCustomer);
    }

    @Override
    public void update(Observable o, Object arg) {
        Product source = (Product)arg;
        ProductEvent productEvent = (ProductEvent)o;
        for(EventCustomer customer : customerSet){
            for(EventCustomType eventCustomType : customer.getCustomTypeSet()){
                if(eventCustomType.getValue() == productEvent.getEventType().getValue()){
                    customer.exec(productEvent);
                }
            }
        }
    }
}
