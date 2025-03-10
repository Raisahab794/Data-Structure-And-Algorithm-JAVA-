package CodeForces;
import java.util.Scanner;
public class IQtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for(int i = 1; i <= n; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if(even > odd) {
            for(int i = 1; i <= n; i++) {
                if(arr[i] % 2 != 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(arr[i] % 2 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
