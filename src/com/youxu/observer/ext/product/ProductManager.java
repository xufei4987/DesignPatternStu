package com.youxu.observer.ext.product;

public class ProductManager {
    private boolean permittedCreate = false;

    public Product createProduct(String name){
        permittedCreate = true;
        Product product = new Product(name, this);
        new ProductEvent(product);
        return product;
    }

    public void abandonProduct(Product product){
        new ProductEvent(product,ProductEventType.DEL_PRODUCT);
        product = null;
    }

    public void editProduct(Product product, String name){
        new ProductEvent(product,ProductEventType.EDIT_PRODUCT);
        product.setName(name);
    }

    public Product cloneProduct(Product product){
        new ProductEvent(product,ProductEventType.CLONE_PRODUCT);
        return product.clone();
    }

    public boolean isPermittedCreate() {
        return permittedCreate;
    }
}
