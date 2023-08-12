package fernandosalas.designpatterns.strategy.example3.controller;

public class CreditCardAlgorithm implements Payment{
    private String email;
    private String password;

    public CreditCardAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit-card");
    }
}
