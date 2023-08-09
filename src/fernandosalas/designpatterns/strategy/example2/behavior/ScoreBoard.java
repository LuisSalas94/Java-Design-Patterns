package fernandosalas.designpatterns.strategy.example2.behavior;

public  class ScoreBoard {
    ScoreAlgorithmBase scoreAlgorithmBase;

    public ScoreBoard(ScoreAlgorithmBase scoreAlgorithmBase) {
        this.scoreAlgorithmBase = scoreAlgorithmBase;
    }

    public void showScore(int taps, int multiplier) {
        System.out.println(scoreAlgorithmBase.calculateScore(taps, multiplier));
    }
}
