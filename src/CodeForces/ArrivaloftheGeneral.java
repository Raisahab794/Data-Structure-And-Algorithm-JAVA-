package CodeForces;
import java.util.*;
public class ArrivaloftheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] soldiers = new int[n];
        for (int i = 0; i < n; i++) {
            soldiers[i] = sc.nextInt();
        }
        int max = soldiers[0];
        int min = soldiers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (soldiers[i] > max) {
                max = soldiers[i];
                maxIndex = i;
            }
            if (soldiers[i] <= min) {
                min = soldiers[i];
                minIndex = i;
            }
        }
        int swaps = 0;
        if (maxIndex > minIndex) {
            swaps = maxIndex + (n - 1 - minIndex) - 1;
        } else {
            swaps = maxIndex + (n - 1 - minIndex);
        }
        System.out.println(swaps);
        sc.close();
    }
}
