package STRING;

public class ProductMain {
    public static void main(String[] args) {
        Product soap = new Product("Milo", 100);
        String productInfo = "Информация о продукте: " + soap;
        System.out.println(productInfo);

        Product mask = new Product("maska", 50);
        Product mask1 = new Product("mmask1", 50);
        // String goods = "";
        StringBuilder goods1 = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            goods1.append(mask).append("\n"); //добавление строки за одно и тоже время в независимости от ее длины
        }


        String allGoods = goods1.toString();
        long start1 = System.currentTimeMillis();

        allGoods = allGoods.concat(mask1.toString());
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(allGoods);
        System.out.println(System.currentTimeMillis() - start); // с какой скоростью выполняются вычисления
        System.out.println(goods1.length());


        //для конкатенации строк

        //String fullName = name + " " + surname;

        //StringBilder text = new StringBilder();
        //text.append(word);

        //String personInfo = fullName.concat (" - ").concat(birthday);

    }
}
