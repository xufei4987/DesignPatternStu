package com.youxu.expression;

public abstract class SymbolExpression implements IExpression{
    protected IExpression left;
    protected IExpression right;
    public SymbolExpression(IExpression left, IExpression right){
        this.left = left;
        this.right = right;
    }
}
