package CodeForces;
import java.util.Scanner;
public class BobAndBigbrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
