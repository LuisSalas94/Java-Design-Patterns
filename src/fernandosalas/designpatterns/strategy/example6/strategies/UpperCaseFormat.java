package fernandosalas.designpatterns.strategy.example6.strategies;

public class UpperCaseFormat implements TextFormattingStrategy{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
