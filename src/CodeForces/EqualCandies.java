package CodeForces;
import java.util.*;
public class EqualCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if (sum % n != 0) {
                System.out.println("NO");
            } else {
                int target = sum / n;
                boolean canEqualize = true;
                for (int i : arr) {
                    if (i > target) {
                        canEqualize = false;
                        break;
                    }
                }
                System.out.println(canEqualize ? "YES" : "NO");
            }
        }
    }
}
