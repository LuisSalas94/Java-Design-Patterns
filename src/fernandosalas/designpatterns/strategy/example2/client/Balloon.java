package fernandosalas.designpatterns.strategy.example2.client;
import fernandosalas.designpatterns.strategy.example2.behavior.ScoreAlgorithmBase;

public class Balloon implements ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
