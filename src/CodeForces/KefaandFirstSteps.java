package CodeForces;
import java.util.*;
public class KefaandFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        int max = 1;
        for(int i = 2; i <= n; i++) {
            if(arr[i] >= arr[i-1]) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = 1;
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
