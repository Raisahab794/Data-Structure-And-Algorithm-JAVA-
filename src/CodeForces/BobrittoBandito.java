package CodeForces;
import java.util.*;
public class BobrittoBandito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Day n
            int m = scanner.nextInt(); // Day m
            int l = scanner.nextInt(); // Left bound on day n
            int r = scanner.nextInt(); // Right bound on day n

            // Calculate the length of the segment on day m
            int lengthOnM = m + 1;

            // Calculate the new left and right bounds
            int lPrime = l + (n - m) / 2;
            int rPrime = lPrime + lengthOnM - 1;

            System.out.println(lPrime + " " + rPrime);
        }
    }
}
