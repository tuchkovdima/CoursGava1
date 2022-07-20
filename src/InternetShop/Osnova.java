package InternetShop;

public class Osnova {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("milk", 80);
        vasyaBasket.add("bread", 90);

        Basket petia = new Basket(101);
        petia.add("lopata", 100);
        petia.add("bochka", 200);

        Basket maha = new Basket("stol", 500);

        maha.print("masha");
        vasyaBasket.print("vasia");
        petia.print("petia");
    }
}
