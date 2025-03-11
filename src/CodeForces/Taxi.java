package CodeForces;
import java.util.Scanner;
public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for(int i = 0; i < n; i++) {
            arr[sc.nextInt()]++;
        }
        int count = arr[4];
        count += arr[3];
        arr[1] -= arr[3];
        if(arr[1] < 0) {
            arr[1] = 0;
        }
        count += arr[2] / 2;
        if(arr[2] % 2 != 0) {
            count++;
            arr[1] -= 2;
        }
        if(arr[1] > 0) {
            count += arr[1] / 4;
            if(arr[1] % 4 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
