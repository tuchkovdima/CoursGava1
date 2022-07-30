package FistLessons;

public class ImmuttableClass { //объекты не изменяемы

    private final String name;
    private final int price;

    public ImmuttableClass(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + "-" + price;
    }
}
