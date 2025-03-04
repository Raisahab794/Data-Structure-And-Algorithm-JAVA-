package CodeForces;
import java.util.*;
public class Hitthelottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] notes = {100, 20, 10, 5, 1};
        int count = 0;
        for (int i = 0; i < notes.length; i++) {
            count += n / notes[i];
            n = n % notes[i];
        }
        System.out.println(count);
        sc.close();
    }
}
