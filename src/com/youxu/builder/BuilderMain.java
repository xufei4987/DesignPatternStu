package com.youxu.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *  在建造者模式中，有如下四个角色：
 *
 * Product 产品类
 *       通常是实现了模板方法模式，也就是有模板方法和基本方法，这个参考上一章节的模板方法模式。在例子中，BenzModel和BMWModel就属于产品类。
 *
 * Builder 抽象建造者
 *       规范产品的组建，一般是由子类实现。在例子中，CarBuilder属于抽象建造者。
 *
 * ConcreteBuilder 具体建造者
 *       实现抽象类定义的所有方法，并且返回一个组件好的对象。在例子中，BenzBuilder和BMWBuilder就属于具体建造者。
 *
 * Director 导演
 *       负责安排已有模块的顺序，然后告诉Builder开始建造，在上面的例子中就是我们的老大，牛叉公司找到老大，说我要这个，这个，那个类型的车辆模型，然后老大就把命令传递给我，我和我的团队就开始拼命的建造，于是一个项目建设完毕了。
 *
 *       建造者模式的通用源代码也比较简单，先看Product类，通常它是一个组合或继承（如模板方法模式）产生的类
 *
 *
 * 1. 建造者模式的优点
 *
 * 封装性
 *       使用建造者模式可以使客户端不必知道产品内部组成的细节，如例子中我们就不需要关心每一个具体的模型内部是如何实现的，产生的对象类型就是CarModel。
 *
 * 建造者独立，容易扩展
 *       BenzBuilder和BMWBuilder是相互独立的，对系统的扩展非常有利。
 *
 * 便于控制细节风险
 *       由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响。
 *
 *       2. 建造者模式的使用场景
 *
 * 相同的方法，不同的执行顺序，产生不同的事件结果时，可以采用建造者模式。
 * 多个部件或零件,都可以装配到一个对象中，但是产生的运行结果又不相同时，则可以使用该模式。
 * 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建造者模式是非常合适。
 * 在对象创建过程中会使用到系统中的一些其它对象，这些对象在产品对象的创建过程中不易得到时，也可以采用建造者模式封装该对象的创建过程。该种场景，只能是一个补偿方法，因为一个对象不容易获得，而在设计阶段竟然没有发觉，而要通过创建者模式柔化创建过程，本身已经违反设计最初目标。
 *       3. 建造者模式的注意事项
 *
 *       建造者模式关注的是的零件类型和装配工艺（顺序），这是它与工厂方法模式最大不同的地方，虽然同为创建类模式，但是注重点不同。
 */
public class BuilderMain {
    public static void main(String[] args) {
//        List<String> sequence = new ArrayList<String>(); //存放run的顺序
//        sequence.add("engineBoom"); //客户要求，run的时候时候先发动引擎
//        sequence.add("start"); //启动起来
//        sequence.add("stop"); //开了一段就停下来
//        //要一个奔驰车：
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//        benz.run();
//
//        //按照同样的顺序，我再要一个宝马
//        BmwBuilder bmwBuilder = new BmwBuilder();
//        bmwBuilder.setSequence(sequence);
//        BmwModel bmw = (BmwModel)bmwBuilder.getCarModel();
//        bmw.run();
        Director director = new Director();
        BenzModel benzModelA = director.getBenzModelA();
        benzModelA.run();

        BenzModel benzModelB = director.getBenzModelB();
        benzModelB.run();
    }
}
