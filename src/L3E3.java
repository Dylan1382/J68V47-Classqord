import java.util.Scanner;

public class L3E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for loan information
        System.out.print("Enter the cost of the loan: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years for the loan: ");
        int numberOfYears = input.nextInt();

        // Calculate monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate the number of monthly payments
        int numberOfPayments = numberOfYears * 12;

        // Calculate the monthly payment using the formula
        double monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)));

        // Display the monthly payment
        System.out.println("Monthly Payment: $" + monthlyPayment);

        input.close();
    }
}
