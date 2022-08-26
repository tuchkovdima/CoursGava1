package Pattern.Strategy;

public class YandexMoneyOperator {
    public static boolean charge(YandexMoney yandexMoney, int amount) {
        return yandexMoney.pay(2);
    }
}
