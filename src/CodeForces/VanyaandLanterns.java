package CodeForces;
import java.util.*;
public class VanyaandLanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double max = 0;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, (arr[i + 1] - arr[i]) / 2.0);
        }
        max = Math.max(max, arr[0]);
        max = Math.max(max, l - arr[n - 1]);
        System.out.println(max);
    }
}
