package CodeForces;
import java.util.*;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            long n = sc.nextLong(); // Read the number
            if (hasOddDivisor(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean hasOddDivisor(long n) {
        return (n & (n - 1)) != 0;
    }
}