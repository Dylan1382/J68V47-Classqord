public class L8E2 {
    public static void main(String[] args) {
        // holds 10 numbers in the array
        int[] examScores = {85, 92, 78, 88, 95, 70, 60, 73, 87, 99};

        // displays the numbers from the array on a new line for each
        System.out.println("Exam Scores:");
        for (int i = 0; i < examScores.length; i++) {
            System.out.println(examScores[i]);
        }

        // calculate the average score
        double totalScore = 0;
        for (int score : examScores) {
            totalScore += score;
        }
        double averageScore = totalScore / examScores.length;

        // display the average exam score says Average Exam Score: then the average score
        System.out.println("Average Exam Score: " + averageScore);
    }
}
