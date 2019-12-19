package com.youxu.expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 表达式模式
 */
public class ExpressionMain {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String, Integer> varMap = getVarMap(expStr);
        Calculator calculator = new Calculator(expStr);
        int result = calculator.run(varMap);
        System.out.println("计算结果为：" + result);
    }

    /**
     * 获取表达式中参数与值的映射
     * @param expStr
     * @return
     * @throws IOException
     */
    private static Map<String,Integer> getVarMap(String expStr) throws IOException {
        Map<String, Integer> varMap = new HashMap<>();
        char[] chars = expStr.toCharArray();
        for(char c : chars){
            if(c != '+' && c != '-'){
                if(!varMap.containsKey(String.valueOf(c))){
                    System.out.print("请输入" + c + "的值:");
                    String var = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    varMap.put(String.valueOf(c),Integer.valueOf(var));
                }
            }
        }
        return varMap;
    }

    private static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
