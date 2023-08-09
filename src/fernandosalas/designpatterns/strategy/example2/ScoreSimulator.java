package fernandosalas.designpatterns.strategy.example2;
import fernandosalas.designpatterns.strategy.example2.behavior.ScoreAlgorithmBase;
import fernandosalas.designpatterns.strategy.example2.behavior.ScoreBoard;
import fernandosalas.designpatterns.strategy.example2.client.Balloon;
import fernandosalas.designpatterns.strategy.example2.client.Clown;
import fernandosalas.designpatterns.strategy.example2.client.SquareBalloon;

public class ScoreSimulator {
    public static void main(String[] args) {
        ScoreAlgorithmBase balloonStrategy = new Balloon();
        ScoreAlgorithmBase clownStrategy = new Clown();
        ScoreAlgorithmBase squareBalloon = new SquareBalloon();

        System.out.println("Balloon Strategy");
        ScoreBoard scoreBoardBalloon = new ScoreBoard(balloonStrategy);
        scoreBoardBalloon.showScore(10, 5);

        System.out.println("Clown Strategy");
        ScoreBoard scoreBoardClown = new ScoreBoard(clownStrategy);
        scoreBoardClown.showScore(10, 5);

        System.out.println("Square Strategy");
        ScoreBoard scoreBoardSquare = new ScoreBoard(squareBalloon);
        scoreBoardSquare.showScore(10, 5);


    }
}
