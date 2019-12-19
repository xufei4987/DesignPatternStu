package com.youxu.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：").append(employee.getName()).append("\t")
                .append("性别：").append(employee.getSex()==Employee.MALE?"男":"女").append("\t")
                .append("薪酬：").append(employee.getName()).append("\t")
                .append(employee.getOtherInfo());
        System.out.println(sb.toString());
    }
}
