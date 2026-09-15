import java.util.Scanner;

public class ValidationUtils {
    
    // Helps prevent the scanner from crashing if user inputs letters instead of numbers
    public static int getValidInt(Scanner sc, String prompt) {
        int result = -1;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                result = Integer.parseInt(input);
                if (result >= 0) {
                    valid = true;
                } else {
                    System.out.println("Error: Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please type a number, not letters.");
            }
        }
        return result;
    }
}
