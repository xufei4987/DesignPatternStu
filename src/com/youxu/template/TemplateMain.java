package com.youxu.template;

/**
 * 1. 模板方法模式的优点
 * 封装不变部分，扩展可变部分。
 *      把认为是不变部分的算法封装到父类实现，而可变部分的则可以通过继承来继续扩展。我们悍马模型例子中，是不是就非常容易扩展，例如增加一个H3型号的悍马模型，很容易呀，增加一个子类，实现父类的基本方法就可以了。
 *
 * 提取公共部分代码，便于维护。
 *      我们例子中刚刚走过的弯路就是最好的证明，如果我们不抽取到父类中，任由这种散乱的代码发生，想想后果是什么样子？维护人员为了修正一个缺陷，需要到处查找类似的代码！
 *
 * 行为控制交由子类来实现。
 *      基本方法是由子类实现的，因此子类可以通过扩展的方式增加相应的功能，符合开闭原则。
 *
 * 2. 模板方法模式的使用场景
 *  多个子类有公有的方法，并且逻辑基本相同时。
 *  重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
 *  重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数（见“模板方法模式的扩展”）约束其行为。
 */
public class TemplateMain {
    public static void main(String[] args) {
        HummerModel hummerH1Model = new HummerH1Model();
        hummerH1Model.setAlarm(false);
        HummerModel hummerH2Model = new HummerH2Model();
        hummerH1Model.setAlarm(true);

        hummerH1Model.run();
        hummerH2Model.run();
    }
}
