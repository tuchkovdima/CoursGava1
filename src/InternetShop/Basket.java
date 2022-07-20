package InternetShop;

import java.time.Period;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public static int count = 0;

    private static int timeout = getTimeout();

    private static int getTimeout () {
        int secondInHour = 3600;
        int hoursInDay = 24;
        int daysInWeek = 7;
        int daysInMouth = 30;
        timeout = secondInHour * hoursInDay;
        return timeout;
    }


    //конструкторы
    public Basket() {
        increaseCount(1);
        count = count + 1;
        items = "Spisok tovarov";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static int getCount() {
        return count;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + price >= limit) {
            return;
        }
        items = items + "\n" + name + "-" + count + "шт" + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    //void нет возвращаемого значение
    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) { //пустая строка или нет
            System.out.println("clean");
        } else {
            System.out.println(items);
        }
    }

}
