package com.youxu.proxy.staticProxy;

public class AnimalProxy implements Animal{
    private Animal animal;
    public AnimalProxy(Animal animal){
        this.animal = animal;
    }
    @Override
    public void eat() {
        animal.eat();
    }

    @Override
    public void bark() {
        animal.bark();
    }
}
