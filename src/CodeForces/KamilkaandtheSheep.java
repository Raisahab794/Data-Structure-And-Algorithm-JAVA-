package CodeForces;

// replace lines 5 to 6
import java.util.*;
public class KamilkaandtheSheep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of sheep
            int[] beautyLevels = new int[n];
            for (int i = 0; i < n; i++) {
                beautyLevels[i] = scanner.nextInt();
            }

            int maxGCD = 0;
            // Compute GCD for all pairs
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    maxGCD = Math.max(maxGCD, gcd(beautyLevels[i], beautyLevels[j]));
                }
            }

            System.out.println(maxGCD);
        }
    }

    // Helper function to compute GCD
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
