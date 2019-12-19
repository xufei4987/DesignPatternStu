package com.youxu.expression;

import java.util.Map;

public class VarExpression implements IExpression {
    private String key;
    public VarExpression(String key){
        this.key = key;
    }
    @Override
    public int interperter(Map<String, Integer> varMap) {
        return varMap.get(this.key);
    }
}
