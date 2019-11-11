package model;

import datasource.DataSource;
import java.util.ArrayList;
import presentation.UI;

public class System {

    private final PizzaMenu menu = new PizzaMenu();
    private final UI ui;
    private final OrderHandler orderHandler;

    public System(UI ui, OrderHandler orderHandler, DataSource dataSource) {
        this.ui = ui;
        this.menu.setMenu(dataSource.getPizzas());
        this.orderHandler = orderHandler;
    }

    public void startProgram() {
        int choice = 0;
        while (choice != 5) {
            ui.println("---------------------- Mario's Pizzabar ----------------------");
            ui.println("1) Se menukort");
            ui.println("2) Opret ordre");
            ui.println("3) Se ordrer");
            ui.println("4) Afslut ordre");
            ui.println("5) Exit");

            try {
                choice = Integer.parseInt(ui.getInput());
                if (choice < 1 || choice > 5) {
                    throw new NumberFormatException();
                }
                switch (choice) {
                    case 1:
                        printMenuCard();
                        break;
                    case 2:
                        makeOrder();
                        break;
                    case 3:
                        listOrders();
                        break;
                    case 4:
                        //completeOrder();
                        break;
                }

            } catch (NumberFormatException e) {
                ui.println("Vælg mellem menupunkt 1 - 5");
            }
        }
    }

    public void printMenuCard() {
        ui.println("---------------------- Mario's Pizzabar ----------------------");
        ArrayList<Pizza> menuCard = menu.getMenu();
        for (Pizza pizza : menuCard) {
            ui.println(pizza + " kr.");
        }
    }

    public void makeOrder() {
        ArrayList<Pizza> pizzas = selectPizzas();
        orderHandler.makeOrder(pizzas);
    }

    public ArrayList<Pizza> selectPizzas() {
        int choice = 0;
        int menuSize = menu.getMenu().size();
        ArrayList<Pizza> chosenPizzas = new ArrayList();
        while (choice != -1) {
            printMenuCard();
            ui.println("\nVælg pizza eller -1 for at afslutte");
            try {
                choice = Integer.parseInt(ui.getInput());
                if (choice != -1) {
                    if (choice < menuSize + 1 && choice > 0) {
                        Pizza p = menu.getPizza(choice);
                        chosenPizzas.add(p);
                    } else {
                        throw new NumberFormatException();
                    }
                }
            } catch (NumberFormatException e) {
                ui.println("Vælg mellem 1 - " + menuSize);
            }
        }
        return chosenPizzas;
    }

    private void listOrders() {
        ArrayList<Order> orders = orderHandler.getOrders();
        for (Order order : orders) {
            ui.println(order.toString());
        }
    }
    
//  TO DO
//    public void completeOrder() {
//        ui.println("Indtast ordrenummer:");
//        int ono = Integer.parseInt(ui.getInput());
//        orderHandler.completeOrder(ono);
//    }

}
