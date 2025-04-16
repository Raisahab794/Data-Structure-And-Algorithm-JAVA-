package CodeForces;
import java.util.*;
public class CheapTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of rides
        int m = scanner.nextInt(); // number of rides in a package
        int a = scanner.nextInt(); // cost of a single ride
        int b = scanner.nextInt(); // cost of a package

        // Calculate the total cost
        long totalCost = Math.min(n * a, Math.min((n / m) * b + (n % m) * a, ((n / m) + 1) * b));
        System.out.println(totalCost);
    }
}
