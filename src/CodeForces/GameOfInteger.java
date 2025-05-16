package CodeForces;
import java.util.*;
public class GameOfInteger {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read number of test cases
            int t = scanner.nextInt();

            // Process each test case
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();

                // Determine the winner based on n % 3
                if (n % 3 == 0) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }

            // Close the scanner to avoid resource leaks
            scanner.close();
        }

}
