import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManager inventory = new InventoryManager();
        OrderManager orderSystem = new OrderManager(inventory);
        boolean running = true;

        System.out.println("=========================================");
        System.out.println("  Retail Inventory & Order System CLI    ");
        System.out.println("=========================================");

        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add New Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Process Customer Order");
            System.out.println("4. Exit Application");
            
            int choice = ValidationUtils.getValidInt(sc, "Enter your choice (1-4): ");

            switch (choice) {
                case 1:
                    System.out.println("\n-- Add Product --");
                    int id = ValidationUtils.getValidInt(sc, "Enter Product ID (e.g., 101): ");
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    int price = ValidationUtils.getValidInt(sc, "Enter Price: ");
                    int stock = ValidationUtils.getValidInt(sc, "Enter Starting Stock: ");
                    
                    inventory.addProduct(id, name, price, stock);
                    break;
                    
                case 2:
                    inventory.viewInventory();
                    break;
                    
                case 3:
                    System.out.println("\n-- Create Order --");
                    int orderId = ValidationUtils.getValidInt(sc, "Enter Product ID to buy: ");
                    int qty = ValidationUtils.getValidInt(sc, "Enter Quantity: ");
                    
                    orderSystem.processOrder(orderId, qty);
                    break;
                    
                case 4:
                    System.out.println("Saving data and exiting... Have a great day!");
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select a valid menu option.");
            }
        }
        sc.close();
    }
}