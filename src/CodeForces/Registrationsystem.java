package CodeForces;
import java.util.*;
public class Registrationsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                int val = map.get(s);
                map.put(s, val + 1);
                System.out.println(s + val);
            } else {
                map.put(s, 1);
                System.out.println("OK");
            }
        }
    }
}
