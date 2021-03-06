package com.youxu.expression;

import java.util.Map;

public class SubExpression extends SymbolExpression {

    public SubExpression(IExpression left, IExpression right) {
        super(left, right);
    }

    @Override
    public int interperter(Map<String, Integer> varMap) {
        return super.left.interperter(varMap) - super.right.interperter(varMap);
    }
}
