package CodeForces;
import java.util.*;
public enum YESorYES {
    ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("YES"))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
