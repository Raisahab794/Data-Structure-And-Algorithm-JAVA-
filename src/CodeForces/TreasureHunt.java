package CodeForces;
import java.util.*;
public class TreasureHunt {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // Number of test cases

            for (int i = 0; i < t; i++) {
                int x = scanner.nextInt(); // Little B's digging depth per day
                int y = scanner.nextInt(); // Little K's digging depth per day
                int a = scanner.nextInt(); // Total depth of the treasure

                // Calculate the total depth required
                double targetDepth = a + 0.5;

                // Determine who digs up the treasure first
                if (x >= targetDepth) {
                    System.out.println("NO");
                } else if (x + y >= targetDepth) {
                    System.out.println("YES");
                } else {
                    // Calculate the number of full cycles (B + K)
                    int fullCycles = (int) (targetDepth / (x + y));
                    double remainingDepth = targetDepth - fullCycles * (x + y);

                    if (remainingDepth <= x) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
}
