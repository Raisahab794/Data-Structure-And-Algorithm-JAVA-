package CodeForces;
import java.util.Scanner;
public class CandiesAndTwoSister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            if(n % 2 == 0) {
                System.out.println(n / 2 - 1);
            } else {
                System.out.println(n / 2);
            }
        }
    }
}
