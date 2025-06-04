package CodeForces;
import java.util.*;
public class FairDivision {
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
            if (sum % 2 != 0) {
                System.out.println("NO");
            } else {
                boolean canDivide = canPartition(arr, sum / 2);
                System.out.println(canDivide ? "YES" : "NO");
            }
        }
    }

    private static boolean canPartition(int[] arr, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];
    }
}
