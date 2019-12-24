package com.youxu.observer.ext.product;

public class Product implements Cloneable {
    private String name;
    private boolean canChanged = false;

    public Product(String name, ProductManager productManager){
        if (productManager.isPermittedCreate()) {
            this.name = name;
            this.canChanged = true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.canChanged){
            this.name = name;
        }
    }

    @Override
    public Product clone() {
        Product p = null;
        try {
            p = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
