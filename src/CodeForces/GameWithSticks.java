package CodeForces;
import java.util.*;
public class GameWithSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(calculateSticks(n, m));
    }

 private static String calculateSticks(int n, int m) {
        int moves = Math.min(n, m);
        return (moves % 2 == 0) ? "Malvika" : "Akshat";
    }
}
