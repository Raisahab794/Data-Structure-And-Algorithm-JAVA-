package CodeForces;
import java.util.Scanner;
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] home = new int[n];
        int[] guest = new int[n];
        for(int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && home[i] == guest[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
