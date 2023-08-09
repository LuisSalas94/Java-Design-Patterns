package fernandosalas.designpatterns.strategy.example1.client;

import fernandosalas.designpatterns.strategy.example1.flybehavior.FlyWithWings;
import fernandosalas.designpatterns.strategy.example1.quackbehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard Duck 🦆");
    }

}
