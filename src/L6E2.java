import java.util.Scanner;

public class L6E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Say 'hello'");
            System.out.println("2. Tell me the time");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");

            // Read user's choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    // You can add code here to tell the time
                    System.out.println("Current time: 12:00 PM");
                    break;
                case 3:
                    // You can add code here to tell a joke
                    System.out.println("Why don't scientists trust atoms? Because they make up everything!");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close(); // Close the scanner
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-4).");
            }
        }
    }
}

