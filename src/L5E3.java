import java.util.Scanner;
import java.util.Random;

public class L5E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("Welcome to the Math Quiz Game!");

        for (int i = 1; i <= 10; i++) {
            int num1 = random.nextInt(10); // gens a random number between 0 and 9
            int num2 = random.nextInt(10); // gens another random number between 0 and 9
            int correctAnswer = num1 + num2;

            System.out.println("Question " + i + ": What is " + num1 + " + " + num2 + "?");
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of 10");

        scanner.close();
    }
}
