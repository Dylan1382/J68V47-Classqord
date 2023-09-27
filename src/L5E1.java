import java.util.Scanner;
public class L5E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asks user for a base number
        System.out.print("Input a base number: ");
        int baseNumber = scanner.nextInt();

        System.out.println("Times table for " + baseNumber + ":");  // says Time table for the input number:
        for (int i = 1; i <= 12; i++) { // makes i = to 1 to 11
            System.out.println(baseNumber + " x " + i + " = " + (baseNumber * i));  // takes baseNumber then X i then prints baseNumber X i = baseNumber x i
        }

        scanner.close();
    }
}
