package CodeForces;
import java.util.*;
public class PlusOneOnTheSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int max = Arrays.stream(a).max().getAsInt(); // Find the maximum element
            int count = 0;
            for (int num : a) {
                if (num != max) {
                    count++; // Count elements not equal to the maximum
                }
            }
            System.out.println(count); // Minimum number of operations
        }
        sc.close();
    }
}
