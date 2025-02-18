package CodeForces;

public class EvenOdds {
    public static void main(String[] args) {
        System.out.println(evenOdds(10, 3));
    }

    public static long evenOdds(long n, long k) {
        if (n % 2 == 0) {
            if (k <= n / 2) {
                return 2 * k - 1;
            } else {
                return 2 * (k - n / 2);
            }
        } else {
            if (k <= (n + 1) / 2) {
                return 2 * k - 1;
            } else {
                return 2 * (k - (n + 1) / 2);
            }
        }
    }
}
