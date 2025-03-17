package CodeForces;
import java.util.*;
public class SumofRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int count = 0;
            while (n > 0) {
                int rem = n % 10;
                if (rem != 0) {
                    list.add(rem * (int) Math.pow(10, count));
                }
                n /= 10;
                count++;
            }
            System.out.println(list.size());
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
