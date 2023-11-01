public class L8E1 {
    public static void main(String[] args) {
// makes a array with student names
String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // displays First student's names: then there names
        System.out.println("First student's name: " + studentNames[0]);

        // displays last student's names: then there names
        System.out.println("Last student's name: " + studentNames[studentNames.length - 1]);

        // displays the number of items in the array
        System.out.println("Number of items in the array: " + studentNames.length);
    }
}
