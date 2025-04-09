package CodeForces;
import java.util.*;
public class PlusorMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int diff=Math.abs(a-b);
            count+=(diff+9)/10;
            System.out.println(count);
        }
    }
}
