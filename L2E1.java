import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Your favorite hobby is: " + hobby);

        scanner.close();
    }
}
