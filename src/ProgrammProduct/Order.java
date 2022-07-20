package ProgrammProduct;

public class Order {
    public void addProdict(Product product) {
        if (product.getPrice() > 50) {
            product.setPrice(product.getPrice() - 25);
        }
    }
    public void addProductCopy (Product product) {
        Product copy = new Product(product.getName(), product.getPrice());
        // add copy to order
    }

}
