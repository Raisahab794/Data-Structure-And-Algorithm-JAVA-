package CodeForces;
import java.util.Scanner;
public class presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[j] == i) {
                    System.out.print(j + " ");
                }
            }
        }
        sc.close();
    }
}
