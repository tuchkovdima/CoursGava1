package Pattern.Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Tort", 650), 1);
        cart.addItem(new Item("Milk", 650), 1);
        cart.addItem(new Item("Bread", 650), 1);

        //Pay by credit card
        cart.pay(new CreditCard("747584848985959"),
                "Dmitry Petrov", "899");
        //Pay by cash later
        cart.pay(new Cash());

        // Pay by YandexMoney
        cart.pay(new YandexMoney("747584848985959"));
    }
}
