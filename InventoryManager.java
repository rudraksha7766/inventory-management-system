import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<Product> productList;

    public InventoryManager() {
        // Load data from file when manager is created
        this.productList = FileHandler.loadInventory();
    }

    public void addProduct(int id, String name, double price, int stock) {
        Product newProduct = new Product(id, name, price, stock);
        productList.add(newProduct);
        FileHandler.saveInventory(productList);
        System.out.println("Success! Product added to inventory.");
    }

    public void viewInventory() {
        System.out.println("\n--- Current Inventory ---");
        if (productList.isEmpty()) {
            System.out.println("No products in inventory yet.");
        } else {
            for (Product p : productList) {
                System.out.println(p.toString());
            }
        }
        System.out.println("-------------------------");
    }

    public Product getProductById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    // Updates the text file whenever a change is made
    public void syncStorage() {
        FileHandler.saveInventory(productList);
    }
}