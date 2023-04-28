package de.neuefische.model;

import java.util.Map;

public class ShopService {

    private ProductRepo productsList = new ProductRepo();
    private OrderRepo ordersList = new OrderRepo();

    public ProductRepo getProductsList() throws ProductNotFoundException {
        productsList.getById("2");
        return productsList;
    }

    public Map<String, Order> getOrdersList() {
        return ordersList.getOrders();
    }
}
