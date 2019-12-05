package com.youxu.decorate;
//装饰模式：不对原有继承关系中的类进行修改，通过装饰者实现功能的扩展
public class DecorateMain {
    public static void main(String[] args) {
        SchoolReport mySchoolReport = new MySchoolReport();
        SchoolReport highScoreDecorator = new HighScoreDecorator(mySchoolReport);
        SchoolReport sortDecorator = new SortDecorator(highScoreDecorator);

        sortDecorator.report();
        sortDecorator.sign("老父亲");
    }
}
