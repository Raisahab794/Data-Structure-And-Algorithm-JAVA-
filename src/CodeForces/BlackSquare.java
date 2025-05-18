package CodeForces;
import java.util.*;
public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (char c : s.toCharArray()) {
            ans += arr[c - '1'];
        }
        System.out.println(ans);
    }
}
