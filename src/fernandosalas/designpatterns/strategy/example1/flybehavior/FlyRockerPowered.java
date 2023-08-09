package fernandosalas.designpatterns.strategy.example1.flybehavior;

public class FlyRockerPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
