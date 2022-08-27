package Pattern.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        OrderCollectionmpl orders = new OrderCollectionmpl();
        generateOrders(orders);

        OrderIterator iterator = orders.iterator(DeliveryType.AIRPLANE);
        while (iterator.hasNext()){
            Order order = iterator.next();
            System.out.println(order);
        }

    }
    public static void generateOrders(OrderCollectionmpl orders){
        orders.addOrder(new Order(5670), DeliveryType.AIRPLANE);
    }
}
