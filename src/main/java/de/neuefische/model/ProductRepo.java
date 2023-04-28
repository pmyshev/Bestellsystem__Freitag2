package de.neuefische.model;

import java.util.ArrayList;

public class ProductRepo {
    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getById(String id) throws ProductNotFoundException {
        for (Product product : this.products) {
            if (product.getId().equals(id))
                return product;
        }
        throw new ProductNotFoundException("product with ID " + id + " not found");
    }

    public Product addProduct(Product p){
        this.products.add(p);
        return p;
    }
}
