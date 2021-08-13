# 设计模式

学习设计模式可以提升代码质量及整体架构，在实践过程中切莫过度设计，设计模式核心就是**匹配业务模型**，决定使用哪种最优设计模式。

## 设计原则

SOLID原则：S(单一职责原则(SRP))、O(开闭原则(OCP))、L(里氏替换原则(LSP)，迪米特原则(LOD))、I(接口隔离原则(ISP))、D(依赖倒置原则(DIP))；
具体可以参考[设计原则](/theory/设计原则.md)各个设计原则的含义。

## 设计模式类型

|创建型模式|概括|
|:---|---|
|[单例模式（Singleton Pattern）](./theory/创建型/单例模式.md)|一个类一个实例|
|[工厂模式（Factory Pattern）](./theory/创建型/工厂方法.md)|创建对象的接口，让子类决定实例化哪个类|
|[原型模式（Prototype Pattern）](./theory/创建型/原型模式.md)|通过拷贝这些原型创建新的对象|
|[建造者模式（Builder Pattern）](./theory/创建型/建造者模式.md)|一个类一个实例|
|[抽象工厂模式（Abstract Factory Pattern）](./theory/创建型/抽象工厂.md)|为创建一组相关或者是互相依赖的对象提供一个接口，而不需要指定它们的具体类|

|结构型模式|概括|
|:---|---|
|[代理模式（Proxy Pattern）](./theory/结构型/代理模式.md)|为其他对象提供一种代理来控制对这个对象的访问|
|[适配器模式（Adapter Pattern）](./theory/结构型/适配器模式.md)|把一个类的接口转换成客户所期待的另一种接口，使无法因为接口不匹配而无法在一起工作的两个类能够在一起工作|
|[装饰器模式（Decorator Pattern）](theory/结构型/装饰模式.md)|动态地给一个对象添加额外的职责|
|[享元模式（Flyweight Pattern）](./theory/结构型/享元模式.md)|使用共享对象可有效的支持大量颗粒度的对象|
|[外观模式（Facade Pattern）](./theory/结构型/外观模式.md)|要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行|
|桥接模式（Bridge Pattern）||
|组合模式（Composite Pattern）||

|行为型模式|概括|
|:---|---|
|[责任链模式（Chain of Responsibility Pattern）](./theory/行为型/责任链模式.md)|使多个对象都有机会处理请求，从而避免了请求的发送者和接收者间的耦合关系;将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止|
|[策略模式（Strategy Pattern）](./theory/行为型/策略模式.md)|定义了一些列算法，将每个算法封装起来，使它们可以相互替换,让算法独立于使用它的客户而独立变化|
|[模板模式（Template Pattern）](./theory/行为型/模板方法.md)|封装流程|
|[观察者模式（Observer Pattern）](./theory/行为型/观察者模式.md)|定义对象间一种一对多关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。|
|备忘录模式（Memento Pattern）||
|迭代器模式（Iterator Pattern）||
|中介者模式（Mediator Pattern）||
|命令模式（Command Pattern）||
|访问者模式（Visitor Pattern）||
|解释器模式（Interpreter Pattern）||
|状态模式（State Pattern）||