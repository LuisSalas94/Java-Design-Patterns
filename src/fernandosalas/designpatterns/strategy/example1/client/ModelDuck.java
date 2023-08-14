package fernandosalas.designpatterns.strategy.example1.client;

import fernandosalas.designpatterns.strategy.example1.flybehavior.FlyNoWay;
import fernandosalas.designpatterns.strategy.example1.quackbehavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }

}
