package CodeForces;
import java.util.*;
public class BuyaShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int count = 1;
        while (true) {
            if ((k * count) % 10 == 0 || (k * count) % 10 == r) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
