package fernandosalas.designpatterns.strategy.example6.strategies;

public class PlainTextFormat implements TextFormattingStrategy{
    @Override
    public String formatText(String text) {
        return text;
    }
}
