package CodeForces;
import java.util.*;
public class IdealGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int ans = (n * 2) / 3;
            System.out.println(ans);
        }
    }
}
