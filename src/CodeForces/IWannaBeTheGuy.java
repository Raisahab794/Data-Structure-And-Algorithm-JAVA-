package CodeForces;
import java.util.Scanner;
public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] levels = new boolean[n];
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            levels[sc.nextInt()-1] = true;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            levels[sc.nextInt()-1] = true;
        }
        for (int i = 0; i < n; i++) {
            if (!levels[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}
