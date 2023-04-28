package de.neuefische.model;

import java.util.ArrayList;

public class Order {
    private String id;
    ArrayList<Product> products = new ArrayList<>();

    public Order(String id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }
}
