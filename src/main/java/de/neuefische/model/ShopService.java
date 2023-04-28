package de.neuefische.model;

import java.util.ArrayList;
import java.util.Map;

public class ShopService {

    private String[] availableProducts;
    private ProductRepo productsList = new ProductRepo();
    private OrderRepo ordersList = new OrderRepo();

    public ShopService(String[] availableProducts) {
        this.availableProducts = availableProducts;
        int id = 1;
        for (String availableProduct : availableProducts) {
            Product p = new Product(String.valueOf(id), availableProduct);
            productsList.addProduct(p);
            id++;
        }
    }

    public Order addOrder(Order o){
        this.ordersList.add(o);
        return o;
    }

    public Product getProductById(String id) throws ProductNotFoundException {

        return productsList.getById(id);
    }

    public ProductRepo getProductList() {
        return productsList;
    }

    public OrderRepo getOrdersList() {
        return this.ordersList;
    }

    public void beautifulPrintProductsList(){
        String leftAlignFormat = "| %-8s | %-18s |%n";
        ArrayList<Product> products = this.productsList.getProducts();

        System.out.format("+----------+--------------------+%n");
        System.out.format("|  Nummer  |       Artikel      |%n");
        System.out.format("+----------+--------------------+%n");
        for (Product currentProduct : products) {
            System.out.format(leftAlignFormat, currentProduct.getId(), currentProduct.getName());
        }
        System.out.format("+----------+--------------------+%n");
    }

}
