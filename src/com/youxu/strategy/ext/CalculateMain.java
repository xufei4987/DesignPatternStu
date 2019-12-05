package com.youxu.strategy.ext;

public class CalculateMain {
    public static void main(String[] args) {
        System.out.println(Calculator.ADD.exec(5, 2));
        System.out.println(Calculator.SUB.exec(5, 2));
        System.out.println(Calculator.MUL.exec(5, 2));
    }
}
