package Pattern.Strategy;

public class YandexMoney  implements  PaymentMetod{
    private String billNumber;

    public YandexMoney(String billNumber) {
        this.billNumber = billNumber;
    }
    public boolean pay(int amount){
        if (YandexMoneyOperator.charge(this, amount)){
            System.out.println("Charge successful!");
            return true;
        }
        System.out.println("Error while charge YandexMoney");
        return false;
    }
}
