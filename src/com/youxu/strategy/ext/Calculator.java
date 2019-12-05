package com.youxu.strategy.ext;
//枚举策略
public enum  Calculator {
    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a-b;
        }
    },
    MUL("*"){
        @Override
        public int exec(int a, int b) {
            return a*b;
        }
    };

    private String symbol;

    Calculator(String symbol) {
        this.symbol = symbol;
    }

    public abstract int exec(int a, int b);
}
