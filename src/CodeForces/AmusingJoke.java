package CodeForces;
import java.util.*;
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s = s1 + s2;
        char[] c1 = s.toCharArray();
        char[] c2 = s3.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
