package CodeForces;
import java.util.*;
public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of friends
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt(); // read the amount of money each friend has
        }
        Arrays.sort(a); // sort the array to find the maximum amount
        int max = a[n - 1]; // maximum amount of money
        long totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalCost += max - a[i]; // calculate the total cost to make all amounts equal
        }
        System.out.println(totalCost); // output the total cost
    }
}
