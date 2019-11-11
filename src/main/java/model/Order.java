package model;

import java.util.ArrayList;

/**
 *
 * @author TM
 */
public class Order {

    private int orderNo;  
    private ArrayList<Pizza> pizzas = new ArrayList(); 

    public Order(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    @Override
    public String toString() {
        return "Ordre Nr:   " + orderNo
                /*+ "\nAfhentningstidspunkt:\t" + afhentningsTidspunkt */
                + "\nOrdre beskrivelse:\n\t" + pizzas;
    }

    void setOrderNo(int ono) {
        this.orderNo = ono;
    }

}
