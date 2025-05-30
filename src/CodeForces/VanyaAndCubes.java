package CodeForces;
import java.util.*;
public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int sum = 0;
        while (n > 0) {
            k++;
            sum += k;
            n -= sum;
        }
        if (n < 0) {
            System.out.println(k - 1);
        } else {
            System.out.println(k);
        }
    }
}
