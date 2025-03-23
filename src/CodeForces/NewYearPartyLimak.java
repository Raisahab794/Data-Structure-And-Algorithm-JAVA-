package CodeForces;
import java.util.*;
public class NewYearPartyLimak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += max - arr[i];
        }
        System.out.println(sum);
    }
}
