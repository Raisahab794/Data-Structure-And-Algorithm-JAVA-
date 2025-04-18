package CodeForces;
import java.util.*;
public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int count = 0;
        while (x > 0) {
            count += x & 1;
            x >>= 1;
        }

        System.out.println(count);
    }
}
