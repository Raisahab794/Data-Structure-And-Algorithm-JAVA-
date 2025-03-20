package CodeForces;
import java.util.*;
public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            min = Math.min(min, list.get(i + n - 1) - list.get(i));
        }
        System.out.println(min);
    }
}
