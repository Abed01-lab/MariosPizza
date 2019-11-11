package model;

import java.util.ArrayList;

/**
 *
 * @author TM
 */
public class PizzaMenu {

    private ArrayList<Pizza> menu = new ArrayList();

    public void add(Pizza pizza) {
        menu.add(pizza);
    }

    public Pizza getPizza(int pizzaNumber) {
        for (Pizza pizza : menu) {
            if (pizza.getId() == pizzaNumber) {
                return pizza;
            }
        }
        return null;
    }

    public void setMenu(ArrayList<Pizza> menuCard) {
        this.menu = menuCard;
    }

    public ArrayList<Pizza> getMenu() {
        return menu;
    }
    
    
    
}
