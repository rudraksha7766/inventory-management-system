public class OrderManager {
    private InventoryManager invManager;

    public OrderManager(InventoryManager invManager) {
        this.invManager = invManager;
    }

    public void processOrder(int productId, int quantityToBuy) {
        Product p = invManager.getProductById(productId);
        
        if (p == null) {
            System.out.println("Order failed: Product ID not found.");
            return;
        }
        
        if (p.getStock() >= quantityToBuy) {
            // reduce stock
            p.setStock(p.getStock() - quantityToBuy);
            invManager.syncStorage(); // save changes to file
            
            double totalCost = p.getPrice() * quantityToBuy;
            System.out.println("\nOrder Processed Successfully!");
            System.out.println("Item: " + p.getName());
            System.out.println("Quantity: " + quantityToBuy);
            System.out.println("Total Amount Due: Rs." + totalCost);
        } else {
            System.out.println("Order failed: Not enough stock available. Current stock is " + p.getStock());
        }
    }
}
