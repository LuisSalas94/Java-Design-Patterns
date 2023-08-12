package fernandosalas.designpatterns.strategy.example6.context;

import fernandosalas.designpatterns.strategy.example6.strategies.TextFormattingStrategy;

public class TextFormatter {
    private TextFormattingStrategy strategy;

    public TextFormatter(TextFormattingStrategy strategy) {
        this.strategy = strategy;
    }

    public String format(String text) {
        return strategy.formatText(text);
    }
}
