package com.youxu.expression;

import java.util.Map;
import java.util.Stack;

public class Calculator {
    private IExpression expression;
    public Calculator(String expStr){
        Stack<IExpression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        IExpression leftExp = null;
        IExpression rightExp = null;
        for (int i = 0; i < chars.length; i++){
            switch (chars[i]){
                case '+':
                    leftExp = stack.pop();
                    rightExp = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(leftExp,rightExp));
                    break;
                case '-':
                    leftExp = stack.pop();
                    rightExp = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(leftExp,rightExp));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        expression = stack.pop();
    }

    public int run(Map<String,Integer> varMap){
        return expression.interperter(varMap);
    }
}
