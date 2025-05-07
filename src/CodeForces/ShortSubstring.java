package CodeForces;
import java.util.*;
public class ShortSubstring {

        // Function to process each test case and return the result
        public static String guessString(String b) {
            StringBuilder a = new StringBuilder();
            a.append(b.charAt(0));  // The first character of 'a' is the first character of 'b'

            // Iterate through b and pick every second character starting from b[1]
            for (int i = 1; i < b.length(); i += 2) {
                a.append(b.charAt(i));
            }

            return a.toString();
        }

        public static void main(String[] args) {
            // Create a Scanner object for reading input
            Scanner sc = new Scanner(System.in);

            // Read the number of test cases
            int t = sc.nextInt();
            sc.nextLine();  // Consume the remaining newline character

            // Loop through each test case
            for (int i = 0; i < t; i++) {
                String b = sc.nextLine();  // Read the string b
                System.out.println(guessString(b));  // Print the result for the current test case
            }

            // Close the scanner
            sc.close();
        }
    }


