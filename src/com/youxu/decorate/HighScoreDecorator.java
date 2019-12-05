package com.youxu.decorate;

public class HighScoreDecorator extends ReportDecorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }

    private void reportHighScore() {
        System.out.println("本次考试最高分：语文-99，数学-100，英语-95");
    }


}
