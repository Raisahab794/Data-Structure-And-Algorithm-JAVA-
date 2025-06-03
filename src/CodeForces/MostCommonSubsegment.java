package CodeForces;
import java.util.*;

public class MostCommonSubsegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int k = sc.nextInt(); // Element to check
            int[] a = new int[n];
            boolean exists = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == k) {
                    exists = true; // Check if k exists in the array
                }
            }
            System.out.println(exists ? "YES" : "NO");
        }
        sc.close();
    }
}