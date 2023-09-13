import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store item names and prices
        String[] itemNames = new String[3];
        double[] itemPrices = new double[3];

        // Input for three items
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            itemNames[i] = scanner.nextLine();
            System.out.print("Enter the price of item " + (i + 1) + " (£): ");
            itemPrices[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
        }

        // Calculate the subtotal
        double subtotal = 0;
        for (double price : itemPrices) {
            subtotal += price;
        }

        // Display the receipt
        System.out.println("NESMART");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s£%.2f%n", itemNames[i], itemPrices[i]);
        }
        System.out.printf("SUBTOTAL..£%.2f%n", subtotal);

        scanner.close();
    }
}
