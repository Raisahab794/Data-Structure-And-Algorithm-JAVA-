package CodeForces;
import java.util.*;
public class KthNotDivisibleByn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long l = 1;
            long r = Long.MAX_VALUE;
            while (l < r) {
                long mid = (l + r) / 2;
                if (mid - mid / n >= k) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            System.out.println(l);
        }
    }
}
