package com.youxu.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        CommonEmployee commEmp = new CommonEmployee();
        commEmp.setName("zhangsan");
        commEmp.setSalary(5000);
        commEmp.setSex(0);
        commEmp.setJob("code and report");
        Manager mng = new Manager();
        mng.setName("lisi");
        mng.setSalary(20000);
        mng.setSex(1);
        mng.setPerformance("report and management");
        commEmp.accept(visitor);
        mng.accept(visitor);
    }
}
