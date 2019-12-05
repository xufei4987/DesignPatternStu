package com.youxu.decorate;

public class MySchoolReport implements SchoolReport {
    @Override
    public void report() {
        System.out.println("我的成绩：语文90，数学94，英语85");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签字：" + name);
    }

}
