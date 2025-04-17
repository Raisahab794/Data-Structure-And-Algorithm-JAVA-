package CodeForces;
import java.util.*;
public class MediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Read the number of test cases
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // Using Math.max and Math.min to find the middle value
            int max = Math.max(a, Math.max(b, c));  // Find the maximum of the three numbers
            int min = Math.min(a, Math.min(b, c));  // Find the minimum of the three numbers
            int middle = a + b + c - max - min;     // The middle number is the one that isn't the max or the min

            System.out.println(middle);  // Output the middle number
        }
        sc.close();
    }
}
