import java.util.Scanner;

public class L7E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Calculate the sum
        int sum = firstNumber + secondNumber;

        // Display the result
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);

        // Close the scanner
        scanner.close();
    }
}
