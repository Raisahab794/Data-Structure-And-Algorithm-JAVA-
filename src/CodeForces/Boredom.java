package CodeForces;
import java.util.*;
public class Boredom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100001];
        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()]++;
        }
        long ans = 0;
        long prev = 0;
        for (int i = 1; i < arr.length; i++) {
            long temp = Math.max(prev, ans);
            ans = prev + (long) arr[i] * i;
            prev = temp;
        }
        System.out.println(Math.max(ans, prev));
    }
}
