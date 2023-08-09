package fernandosalas.designpatterns.strategy.example1;
import fernandosalas.designpatterns.strategy.example1.client.Duck;
import fernandosalas.designpatterns.strategy.example1.client.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
