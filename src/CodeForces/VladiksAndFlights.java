package CodeForces;
import java.util.*;
public class VladiksAndFlights {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        int a = fs.nextInt();
        int b = fs.nextInt();
        String s = fs.next();
        if (s.charAt(a - 1) == s.charAt(b - 1)) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
