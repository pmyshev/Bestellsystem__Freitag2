package de.neuefische.model;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String id;
    private static int initialId  = 10;
    OrderStatus status;
    Date date = new Date();
    ArrayList<Product> products = new ArrayList<>();

    public Order(ArrayList<Product> products) {
        this.id = String.valueOf(initialId++);
        this.products = products;
        this.status = OrderStatus.RECEIVED;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}
