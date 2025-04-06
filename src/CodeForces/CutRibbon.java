package CodeForces;
import java.util.*;
public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            if (dp[i] != -1) {
                if (i + a <= n) {
                    dp[i + a] = Math.max(dp[i + a], dp[i] + 1);
                }
                if (i + b <= n) {
                    dp[i + b] = Math.max(dp[i + b], dp[i] + 1);
                }
                if (i + c <= n) {
                    dp[i + c] = Math.max(dp[i + c], dp[i] + 1);
                }
            }
        }
        System.out.println(dp[n]);
    }
}
