package model;

import java.util.ArrayList;

/**
 *
 * @author TM
 */
public class OrderHandler {
    
    private final ArrayList<Order> orders = new ArrayList();
    
    public void makeOrder(ArrayList<Pizza> pizzas) {
        Order order = new Order(pizzas); 
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
       return orders;
    }    

//    TO DO
// public void completeOrder(int ono) {
//        Order tmp;
//        for (int i = 0; i < orders.size(); i++) {
//            tmp = orders.get(i);
//            if (tmp.getOrderNo()== ono) {
//                orders.remove(i);
//                return;
//            }
//        }
//    }


}
