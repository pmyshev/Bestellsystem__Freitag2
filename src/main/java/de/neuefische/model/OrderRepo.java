package de.neuefische.model;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    private Map<String, Order> orders = new HashMap<>();

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }

    public Order add(Order o) {
        this.orders.put(o.getId(), o);
        return o;
    }

    public Order getById(String id) throws OrderNotFoundException {
        if (this.orders.containsKey(id)) {
        return orders.get(id);
        }
        throw new OrderNotFoundException("order with ID " + id + " not found");
        }

    public Map<String, Order> getOrders() {
        return orders;
    }
}

