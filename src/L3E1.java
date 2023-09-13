import java.util.Scanner;

public class L3E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first name from user
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Input surname from user
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your year of birth (e.g., 1999): ");
        int yearOfBirth = scanner.nextInt();

        // Generate the username and password
        String username = generateUsername(firstName, surname);
        String password = generatePassword(surname, firstName, yearOfBirth);

        // Display the results
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + password);

        scanner.close();
    }

    // Method to generate the username
    public static String generateUsername(String firstName, String surname) {
        char firstLetter = firstName.charAt(0);
        String lowercaseSurname = surname.toLowerCase();
        return Character.toString(firstLetter) + lowercaseSurname;
    }

    // Method to generate the password
    public static String generatePassword(String surname, String firstName, int yearOfBirth) {
        char lowercaseInitial = surname.toLowerCase().charAt(0);
        String uppercaseFirstThreeLetters = firstName.substring(0, Math.min(3, firstName.length())).toUpperCase();
        String yearOfBirthStr = Integer.toString(yearOfBirth);

        return Character.toString(lowercaseInitial) + uppercaseFirstThreeLetters + yearOfBirthStr;
    }
}
