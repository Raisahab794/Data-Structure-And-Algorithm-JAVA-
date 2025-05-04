package CodeForces;
import java.util.*;
public class DieRoll {


        // Method to compute the greatest common divisor (GCD) using Euclidean algorithm
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            // Read input
            Scanner scanner = new Scanner(System.in);
            int Y = scanner.nextInt();
            int W = scanner.nextInt();
            scanner.close();

            // Find the maximum of Yakov's and Wacko's rolls
            int maxRoll = Math.max(Y, W);

            // Number of favorable outcomes for Dot
            int favorable = 6 - maxRoll + 1;

            // Total possible outcomes are 6 (since it's a 6-sided die)
            int total = 6;

            // Find the greatest common divisor (GCD) to simplify the fraction
            int gcdValue = gcd(favorable, total);

            // Simplified fraction
            int numerator = favorable / gcdValue;
            int denominator = total / gcdValue;

            // Output the result in the form "A/B"
            System.out.println(numerator + "/" + denominator);
        }

}
