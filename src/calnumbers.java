import java.util.Scanner;
public class calnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inputs
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        // uses addition and multiplication and more for both numbers
        double additionResult = num1 + num2;
        double subtractionResult = num1 - num2;
        double multiplicationResult = num1 * num2;
        double divisionResult = num1 / num2;
        double modulusResult = num1 % num2;
        double exponentiationResult = Math.pow(num1, num2);
        // prints all the results
        System.out.println("Results:");
        System.out.println(num1 + " + " + num2 + " = " + additionResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);
        System.out.println(num1 + " / " + num2 + " = " + divisionResult);
        System.out.println(num1 + " % " + num2 + " = " + modulusResult);
        System.out.println(num1 + " ^ " + num2 + " = " + exponentiationResult);
        scanner.close();
    }
}