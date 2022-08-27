package Pattern.Iterator;

public class Order {
    public Order(int price) {
        this.price = price;
        this.deliveryType = deliveryType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", deliveryType=" + deliveryType +
                '}';
    }

    private int price;
    private DeliveryType deliveryType;

}
