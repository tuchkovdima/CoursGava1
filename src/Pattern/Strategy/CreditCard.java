package Pattern.Strategy;

public class CreditCard {
    private String cvvCode;
    private String cardHolder;
    private String expirationData;
    private  String cardNumber;

    public CreditCard(String cardHolder) {
        this.cardHolder = cardHolder;
        this.expirationData = expirationData;
        this.cardNumber = cardNumber;
    }
public void setCvvCode(String cvvCode){
        this.cvvCode = cvvCode;
}
public boolean pay(int amount){
        if (BankConnection.transferMoney(this, amount)){
            System.out.println("Payed with credit card");
            return true;
        }
    System.out.println("Some error qccured: (");
        return true;
}

}
