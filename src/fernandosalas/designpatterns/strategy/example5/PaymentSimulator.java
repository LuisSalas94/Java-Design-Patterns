package fernandosalas.designpatterns.strategy.example5;

import fernandosalas.designpatterns.strategy.example5.context.PaymentContext;
import fernandosalas.designpatterns.strategy.example5.strategies.CreditCardPayment;
import fernandosalas.designpatterns.strategy.example5.strategies.PaypalPayment;

public class PaymentSimulator {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.processPayment(100);

        paymentContext = new PaymentContext(new PaypalPayment());
        paymentContext.processPayment(50);
    }
}
