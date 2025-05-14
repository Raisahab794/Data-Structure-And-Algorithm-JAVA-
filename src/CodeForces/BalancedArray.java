package CodeForces;
import java.util.*;
public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int[] arr = new int[n];
                for (int i = 0; i < n / 2; i++) {
                    arr[i] = 2 * (i + 1);
                }
                for (int i = n / 2; i < n; i++) {
                    arr[i] = 2 * (i + 1) - 1;
                }
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
