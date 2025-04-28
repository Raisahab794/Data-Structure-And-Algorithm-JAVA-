package CodeForces;
import java.util.*;
public class ServalAndStringTheory {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                //int n = sc.nextInt();
                int k = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                String s = sc.nextLine().trim();
                String reversed = new StringBuilder(s).reverse().toString();

                if (s.compareTo(reversed) < 0) {
                    System.out.println("YES");
                    continue;
                }

                if (s.equals(reversed)) {
                    boolean allSame = true;
                    char firstChar = s.charAt(0);
                    for (int i = 1; i < s.length(); i++) {
                        if (s.charAt(i) != firstChar) {
                            allSame = false;
                            break;
                        }
                    }
                    if (allSame) {
                        System.out.println("NO");
                    } else {
                        System.out.println(k >= 1 ? "YES" : "NO");
                    }
                } else {
                    System.out.println(k >= 1 ? "YES" : "NO");
                }
            }
            sc.close();
        }
}
