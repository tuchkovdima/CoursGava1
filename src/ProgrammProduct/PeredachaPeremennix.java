package ProgrammProduct;

import ProgrammProduct.Product;

public class PeredachaPeremennix {
    public static void main(String[] args) {

        Product product = new Product("milk", 56);
        Order order = new Order();
        order.addProdict(product);
        System.out.println(product);
    }
}
