package com.youxu.observer.ext.product;

import com.youxu.observer.ext.event.EventDispatch;

import java.util.Observable;

public class ProductEvent extends Observable {

    private Product source;
    private ProductEventType eventType;

    public ProductEvent(Product source){
        this(source,ProductEventType.NEW_PRODCUT);
    }

    public ProductEvent(Product source, ProductEventType eventType){
        this.eventType = eventType;
        this.source = source;
        notifyEventDispatch();
    }

    public Product getSource() {
        return source;
    }

    public ProductEventType getEventType() {
        return eventType;
    }

    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }

}
