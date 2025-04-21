package CodeForces;
import java.util.*;
public class CoinCobinationtwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        int mod=1000000007;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= target; j++) {
                if(j - coin >= 0) {
                    dp[j] += dp[j - coin]%mod;
                    dp[j] %= mod;
                }

            }
        }
        System.out.println(dp[target]%mod);
    }
}