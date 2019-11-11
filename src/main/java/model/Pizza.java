package model;

import java.util.Objects;

/**
 *
 * @author TM
 */
public class Pizza {

    private int id;
    private String name;
    private String description; 
    private int price;

    public Pizza(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Pizza(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pizza other = (Pizza) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        if (!this.description.equals(other.description)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return id + " " + name + " " + description + " " + price;
    }
}
