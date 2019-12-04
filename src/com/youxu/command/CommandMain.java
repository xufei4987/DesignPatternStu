package com.youxu.command;
//命令模式的三个角色：接收者（receiver）、调用者（invoker）、命令（command）
public class CommandMain {
    public static void main(String[] args) {
        Command command = new AddRequirementCommand();
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
