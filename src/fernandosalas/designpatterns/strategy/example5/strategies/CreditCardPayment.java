package fernandosalas.designpatterns.strategy.example5.strategies;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using credit card");

    }
}
