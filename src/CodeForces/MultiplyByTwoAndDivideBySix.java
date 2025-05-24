package CodeForces;
import java.util.*;
public class MultiplyByTwoAndDivideBySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long ans = 0;

            while (n % 6 != 0 && n < k) {
                n *= 2;
                ans++;
            }

            if (n % 6 == 0 && n <= k) {
                ans += (k - n) / 6;
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
        }
    }
}
