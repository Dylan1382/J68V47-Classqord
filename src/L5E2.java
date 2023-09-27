import java.util.Scanner;

public class L5E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for( int count=10; count>=1; count-=1 ) // counts down from 10 to 1
        {
            System.out.println(count); // prints thw text from 10 to 1
        }
        System.out.println("Blastoff!!!!!!!\n"); // after count display Blastoff!!!!!!!! then adds a next line
        scanner.close();
    }
}