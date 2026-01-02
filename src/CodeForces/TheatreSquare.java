package CodeForces;
import java.util.Scanner;
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        long x = (n % a == 0) ? n / a : n / a + 1;
        long y = (m % a == 0) ? m / a : m / a + 1;
        System.out.println(x * y);
    }
}
