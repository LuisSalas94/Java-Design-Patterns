package fernandosalas.designpatterns.strategy.example5.strategies;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using paypal.");
    }
}
