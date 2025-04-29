package CodeForces;
import java.util.*;
public class CompositeSum {

        // Function to check if a number is composite
        public static boolean check(int n) {
            if (n <= 1) return false; // No number <= 1 is composite
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return true; // Found a divisor other than 1 and n itself
            }
            return false; // Not a composite number, so it's prime
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            // Loop through possible values of i to find composite pairs
            for (int i = 4; i <= n / 2; i++) {
                int sec = n - i;
                if (check(i) && check(sec)) {
                    System.out.println(i + " " + sec);  // Output the pair
                    return; // Exit after finding the first valid pair
                }
            }

            // In case no valid pair is found
            System.out.println("No valid pair found.");
        }
    }
