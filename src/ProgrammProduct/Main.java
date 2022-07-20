package ProgrammProduct;
import InternetShop.Basket;

public class Main {
    public static void main(String[] args) {

        createBasket();
        Basket basket = new Basket("tovat", 478394);
        Session session = new Session();

        System.out.println(Basket.getCount());
    }
    public static void createBasket (){
        Basket basket= new Basket("tovari", 478394);
    }
}
