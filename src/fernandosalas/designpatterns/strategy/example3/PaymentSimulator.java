package fernandosalas.designpatterns.strategy.example3;

import fernandosalas.designpatterns.strategy.example3.controller.CreditCardAlgorithm;
import fernandosalas.designpatterns.strategy.example3.controller.PaypalAlgorithm;
import fernandosalas.designpatterns.strategy.example3.controller.ShoppingCart;
import fernandosalas.designpatterns.strategy.example3.model.Product;

public class PaymentSimulator {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product pants = new Product(55, "234");
        Product shirt = new Product(15, "987");

        shoppingCart.addProduct(pants);
        shoppingCart.addProduct(shirt);

        shoppingCart.pay(new PaypalAlgorithm("fernando@gmail.com", "secret"));
        shoppingCart.pay(new CreditCardAlgorithm("Fernando", "12345"));


    }
}
