package com.youxu.observer.ext.customer;

import com.youxu.observer.ext.event.EventCustomType;
import com.youxu.observer.ext.product.ProductEvent;

import java.util.HashSet;
import java.util.Set;

public abstract class EventCustomer {
    private Set<EventCustomType> customTypeSet = new HashSet<>();
    public EventCustomer(EventCustomType type){
        addCustomType(type);
    }

    public void addCustomType(EventCustomType type){
        customTypeSet.add(type);
    }

    public Set<EventCustomType> getCustomTypeSet() {
        return customTypeSet;
    }

    public abstract void exec(ProductEvent event);
}
