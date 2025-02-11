package dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// Abstract class for Product with a category type
abstract class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        }
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price;
    }
}
