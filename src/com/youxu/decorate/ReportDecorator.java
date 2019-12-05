package com.youxu.decorate;

public abstract class ReportDecorator implements SchoolReport{
    private SchoolReport schoolReport;
    public ReportDecorator(SchoolReport schoolReport){
        this.schoolReport = schoolReport;
    }
    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
