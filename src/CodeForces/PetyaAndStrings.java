package CodeForces;
import java.util.*;
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
