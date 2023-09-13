import java.util.Scanner;

public class L3E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the quiz questions and correct answers
        String[] questions = {
                "What is the capital of Spain?",
                "What is the largest planet in our solar system?",
                "Who wrote the play 'Romeo and Juliet'?"
        };
        String[] answers = {
                "madrid",
                "jupiter",
                "william shakespeare"
        };

        // Display the questions and get user input
        for (int i = 0; i < questions.length; i++) {
            System.out.print("Q" + (i + 1) + ". " + questions[i] + "\nYour answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            // Check if the user's answer matches the correct answer
            boolean isCorrect = userAnswer.equals(answers[i]);

            // Display the result
            System.out.println(isCorrect ? "True" : "False");
        }

        // Close the scanner
        scanner.close();
    }
}