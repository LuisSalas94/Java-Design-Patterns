package fernandosalas.designpatterns.strategy.example6.strategies;

public class LowerCaseFormat implements TextFormattingStrategy{

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
