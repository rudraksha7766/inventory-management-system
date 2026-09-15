import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private static final String FILE_NAME = "inventory.txt";

    // Writes the entire product list to a text file
    public static void saveInventory(ArrayList<Product> products) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME);
            for (Product p : products) {
                writer.write(p.getId() + "," + p.getName() + "," + p.getPrice() + "," + p.getStock() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    // Loads the data back into the program when it starts
    public static ArrayList<Product> loadInventory() {
        ArrayList<Product> products = new ArrayList<>();
        File file = new File(FILE_NAME);
        
        if (!file.exists()) {
            return products; // return empty if first time running
        }

        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                if(data.length == 4) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    double price = Double.parseDouble(data[2]);
                    int stock = Integer.parseInt(data[3]);
                    products.add(new Product(id, name, price, stock));
                }
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error loading inventory file. Starting fresh.");
        }
        return products;
    }
}
