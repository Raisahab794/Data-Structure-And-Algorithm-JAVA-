package CodeForces;
import java.util.*;
public class PanoramixPredictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 1) {
            System.out.println("NO");
            return;
        }
        for (int i = n + 1; i <= m; i++) {
            if (isPrime(i)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
