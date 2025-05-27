package CodeForces;
import java.util.*;
public class SpellCheck {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
               int t = sc.nextInt();
               while (t-- > 0) {
                   int n = sc.nextInt();
                   String s = sc.next();
                   if (n == 5) {
                       char[] target = {'T', 'i', 'm', 'u', 'r'};
                       char[] input = s.toCharArray();
                       Arrays.sort(target);
                       Arrays.sort(input);
                       if (Arrays.equals(target, input)) {
                           System.out.println("YES");
                       } else {
                           System.out.println("NO");
                       }
                   } else {
                       System.out.println("NO");
                   }
               }
        }
    }

