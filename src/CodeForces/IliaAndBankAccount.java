package CodeForces;
import java.util.*;
public class IliaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n >= 0) {
            System.out.println(n);
        } else {
            long absN = Math.abs(n);
            long result = absN / 10;
            System.out.println(-result);
        }
    }
}

