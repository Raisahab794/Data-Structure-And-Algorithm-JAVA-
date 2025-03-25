package CodeForces;
import java.util.*;
public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int totalDrink = k * l;
        int totalLime = c * d;
        int totalToast = totalDrink / nl;
        int totalSaltToast = p / np;
        int min = Math.min(totalToast, Math.min(totalLime, totalSaltToast));
        System.out.println(min / n);
    }
}
