package CodeForces;
import java.util.   *;
public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            int digitCount = String.valueOf(n).length();
            ans += (digitCount - 1) * 10; // Count all full sets of 1-digit to (digitCount-1)-digit numbers

            // Calculate the number of valid apartments for the current digit count
            int firstDigit = n / (int) Math.pow(10, digitCount - 1);
            ans += firstDigit; // Add the first digit

            // Add the remaining digits
            for (int i = 1; i < digitCount; i++) {
                ans += (n / (int) Math.pow(10, i)) % 10;
            }

            System.out.println(ans);
        }
    }
}
