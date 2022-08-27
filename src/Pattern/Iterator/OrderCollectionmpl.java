package Pattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class OrderCollectionmpl  implements OrderCollection{
    private List<Order> orders;
    public  OrderCollectionmpl(){
        orders  =  new ArrayList<>();

    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public void removeOrder(Order order){
        orders.remove(order);
    }
    public OrderIterator   iterator  (DeliveryType deliveryType){
        return new OrderIterator() {
            private int position  =  0;
            @Override
            public boolean hasNext() {
                for (int i = position; i < orders.size(); i++) {
                    Order order  =  orders.get(i);
                    if (order.getDeliveryType().equals(deliveryType)||
                    order.getDeliveryType().equals(DeliveryType.ALL)){
                        return true;
                    }
                }
                return false;
            }

            @Override
            public Order next() {
                while (position  < orders.size()){
                    Order  order = orders.get(position++);
                    if (order.getDeliveryType().equals(deliveryType)||
                    order.getDeliveryType().equals(DeliveryType.ALL)){
                        return order;
                    }
                }
                return null;
            }
        };
    }

    public void addOrder(Order order, DeliveryType airplane) {
        orders.add(order);
    }
}
