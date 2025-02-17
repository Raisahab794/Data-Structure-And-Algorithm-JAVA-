package CodeForces;
import java.util.Scanner;
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();
        int count = 0;
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            int max = arr[i];
            int index = i;
            for (int j = i; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = max;
            sum1 += max;
            count++;
            if (sum1 > sum / 2) {
                break;
            }
        }
        System.out.println(count);
    }
}
