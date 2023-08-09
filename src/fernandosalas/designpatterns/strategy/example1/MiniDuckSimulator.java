package fernandosalas.designpatterns.strategy.example1;
import fernandosalas.designpatterns.strategy.example1.client.Duck;
import fernandosalas.designpatterns.strategy.example1.client.MallardDuck;
import fernandosalas.designpatterns.strategy.example1.client.ModelDuck;
import fernandosalas.designpatterns.strategy.example1.flybehavior.FlyRockerPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockerPowered());
        model.performFly();
    }
}
