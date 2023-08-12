package fernandosalas.designpatterns.strategy.example6;

import fernandosalas.designpatterns.strategy.example6.context.TextFormatter;
import fernandosalas.designpatterns.strategy.example6.strategies.LowerCaseFormat;
import fernandosalas.designpatterns.strategy.example6.strategies.PlainTextFormat;
import fernandosalas.designpatterns.strategy.example6.strategies.UpperCaseFormat;

public class TextFormatterSimulator {
    public static void main(String[] args) {
        TextFormatter formatter = new TextFormatter(new PlainTextFormat());
        System.out.println("Using PlainTextFormat");
        System.out.println(formatter.format("Hello World\n"));

        System.out.println("Using LowerCaseFormat");
        formatter = new TextFormatter(new LowerCaseFormat());
        System.out.println(formatter.format("HELLO WORLD\n"));

        System.out.println("Using UpperCaseFormat");
        formatter = new TextFormatter(new UpperCaseFormat());
        System.out.println(formatter.format("hello world"));
    }
}
