package de.neuefische;

import de.neuefische.model.*;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] availableProducts = new String[]{
                "Haferflocken", "Thunfisch", "Milch", "1kg Äpfel",
                "Brot", "Eier", "Nüsse", "Reis", "Nudeln",
                "Olivenöl", "Hering", "Tomaten", "Paprika",
                "Avocado", "Mango", "Sauerkraut", "Mineralwasser"

        };

//      Creating new products
//        Product oatmeal = new Product("1", "Haferflocken");
//        Product tuna = new Product("2", "Thunfisch");
//        Product milk = new Product("3", "Milch");
//        Product apples = new Product("4", "1kg Äpfel");

//      Add products to the database
//        ProductRepo productsList = new ProductRepo();
//        productsList.addProduct(oatmeal);
//        productsList.addProduct(tuna);
//        productsList.addProduct(milk);
//        productsList.addProduct(apples);

//      Display a list of all products available for ordering
//        System.out.println(productsList.getProducts());

//      Find an order with a given ID
//        try {
//            System.out.println(productsList.getById("2"));
//        } catch (ProductNotFoundException e) {
//            System.out.println(e.getMessage());;
//        }

//      Warenkorb - Leon
//        ArrayList<Product> warenkorb1 = new ArrayList<>();
//        warenkorb1.add(oatmeal);
//        warenkorb1.add(tuna);

//       Warenkorb - Ben
//        ArrayList<Product> warenkorb2 = new ArrayList<>();
//        warenkorb2.add(milk);
//        warenkorb2.add(apples);

//      Users place an order
//        Order userLeonOrder1 = new Order(warenkorb1);
//        Order userBenOrder1 = new Order(warenkorb2);
//
////      Add orders to the database
//        OrderRepo ordersList= new OrderRepo();
//        ordersList.add(userLeonOrder1);
//        ordersList.add(userBenOrder1);

//      Find an order with a given ID
//        try {
//            System.out.println(ordersList.getById("10"));
//        } catch (OrderNotFoundException e) {
//            System.out.println(e.getMessage());;
//        }

//      get a list of all orders in the system
//        System.out.println(ordersList.getOrders());



        //      Creating new products
        Product oatmeal = new Product("1", "Haferflocken");
        Product tuna = new Product("2", "Thunfisch");
        Product milk = new Product("3", "Milch");
        Product apples = new Product("4", "1kg Äpfel");

        //      Users place an order
        Order order1 = new Order();
        Order order2 = new Order();

        order1.addProduct(oatmeal);
        order1.addProduct(tuna);

        order2.addProduct(milk);
        order2.addProduct(apples);

        ShopService shop = new ShopService(availableProducts);

        shop.addOrder(order1);
        shop.addOrder(order2);


        CLI cli = new CLI();
        cli.printMainMenu();
        cli.printPoem();

        shop.beautifulPrintProductsList();


    }
}