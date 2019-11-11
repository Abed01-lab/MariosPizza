package model;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author TM
 */
public class OrderHandlerTest {

    OrderHandler orderHandler;// = new OrderHandler();

    @Before
    public void setup() {
        orderHandler = new OrderHandler();
    }

    @Test
    public void makeOrderOfOnePizza() {
        //Arrange
        Pizza expectedPizza = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke, oregano", 57);
       
        Pizza iWantThisPizza = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke, oregano", 57);
        ArrayList<Pizza> myPizzas = new ArrayList();
        myPizzas.add(iWantThisPizza);
        
        //Act
        orderHandler.makeOrder(myPizzas);

        //Assert
        ArrayList<Order> allOrders = orderHandler.getOrders();
        assertEquals(1, allOrders.size());
        Order order = allOrders.get(0);
        ArrayList<Pizza> orderPizzas = order.getPizzas();
        Pizza actualPizza = orderPizzas.get(0);
        // Pizza has overridden equals method to make assertEquals work
        assertEquals(expectedPizza, iWantThisPizza);
    }
}
