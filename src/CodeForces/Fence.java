package CodeForces;
import java.util.*;
public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minHeight = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int maxHeight = 0;
            for (int j = i; j < i + k; j++) {
                maxHeight = Math.max(maxHeight, arr[j]);
            }
            minHeight = Math.min(minHeight, maxHeight);
        }
        System.out.println(minHeight);
    }
}
