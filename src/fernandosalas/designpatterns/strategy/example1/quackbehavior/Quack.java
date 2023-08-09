package fernandosalas.designpatterns.strategy.example1.quackbehavior;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
