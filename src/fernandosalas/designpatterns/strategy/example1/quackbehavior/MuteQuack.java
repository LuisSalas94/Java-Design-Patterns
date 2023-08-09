package fernandosalas.designpatterns.strategy.example1.quackbehavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
