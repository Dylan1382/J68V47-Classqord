import java.util.Scanner;

public class lession2addingnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// asks how many items and saves as num
        System.out.print("How many items? ");
        int num = input.nextInt();

// asks price per iten and saves as price
        System.out.print("Price per item £");
        double price = input.nextDouble();

// takes the price then x the number
        double total = price * num;
        System.out.format("Total = £%.2f%n", total);

        input.close();
    }
}
