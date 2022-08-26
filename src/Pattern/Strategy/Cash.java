package Pattern.Strategy;

public class Cash implements PaymentMetod {
    public Cash(){

    }
    public boolean pay(int amount){
        System.out.println("Will be payed later by cash");
        return false;
    }
}
