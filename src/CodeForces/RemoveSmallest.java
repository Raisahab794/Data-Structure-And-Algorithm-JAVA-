package CodeForces;
import java.util.*;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a); // Sort the array
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] > 1) { // Check if the difference is greater than 1
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}