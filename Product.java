// Author: Rudraksha Gaharwar
// University: VIT Bhopal University
// Purpose: Model class to represent an inventory item

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    
    public void setStock(int stock) { this.stock = stock; }

    // This makes it easy to print the product in the terminal
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Price: Rs." + price + " | Stock: " + stock;
    }
}