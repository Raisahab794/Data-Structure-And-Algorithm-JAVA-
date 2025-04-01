package CodeForces;
import java.util.*;
public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long time = 0;
        int prev = 1;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            if (a >= prev) {
                time += a - prev;
            } else {
                time += n - prev + a;
            }
            prev = a;
        }
        System.out.println(time);
    }
}
