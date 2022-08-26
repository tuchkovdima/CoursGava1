package Pattern.Strategy;

import java.util.HashMap;

public class ShoppingCart {
    HashMap<Item, Integer> items;
    public ShoppingCart() {
        items = new HashMap<>();
    }
    public void addItem(Item item, int count){
        if (item.containsKey(item)){
            count = item.get(item) + count;
        }
        items.put(item, count);
    }
    public boolean pay(PaymentMetod paymentMetod){
        int amount = 0;
        for (Item item: items.keySet()){
            amount += item.getPrice() * item.get(item);
        }
        return paymentMetod.pay(amount);
    }

    public void pay(CreditCard creditCard, String dmitry_petrov, String s) {
    }
}
