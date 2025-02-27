package CodeForces;
import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(Character.toLowerCase(s.charAt(i)));
        }
        System.out.println(set.size() == 26 ? "YES" : "NO");
    }
}
