package fernandosalas.designpatterns.strategy.example1.client;
import fernandosalas.designpatterns.strategy.example1.flybehavior.FlyBehavior;
import fernandosalas.designpatterns.strategy.example1.quackbehavior.QuackBehavior;

public abstract class Duck {
    // Add two instances variables of type FlyBehavior and QuackBehavior
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    // Setting Behavior dynamically
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // Add two public methods that delegate the behavior classes
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    abstract void display();

}
