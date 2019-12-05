package com.youxu.decorate;

public class SortDecorator extends ReportDecorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }

    private void reportSort() {
        System.out.println("本次考试排名：10");
    }
}
