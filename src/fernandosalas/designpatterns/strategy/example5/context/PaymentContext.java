package fernandosalas.designpatterns.strategy.example5.context;

import fernandosalas.designpatterns.strategy.example5.strategies.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(int amount) {
        strategy.pay(amount);
    }
}
