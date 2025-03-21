package CodeForces;
import java.util.*;
public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int police = 0;
        int crimes = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == -1) {
                if (police == 0) {
                    crimes++;
                } else {
                    police--;
                }
            } else {
                police += x;
            }
        }
        System.out.println(crimes);
    }
}
