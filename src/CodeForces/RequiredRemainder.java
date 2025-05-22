package CodeForces;
import java.util.*;
public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long lcm = lcm(x, y);
            long ans = (lcm - n % lcm) % lcm;
            if (ans == 0) {
                System.out.println(0);
                continue;
            }
            long num = (ans + n - 1) / n;
            if (num > k) {
                System.out.println(-1);
                continue;
            }
            System.out.println(num);
        }
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
