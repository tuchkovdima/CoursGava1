package Pattern.Strategy;

public class BankConnection {
    public static boolean transferMoney(CreditCard creditCard, int amount) {
        return creditCard.pay(2);
    }
}
